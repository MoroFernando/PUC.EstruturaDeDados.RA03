import hash_functions.HashFunction;
import register_code.RegisterCode;
import register_code.RegisterCodesArray;
import utils.TimeCalculator;

public class HashTable {
  private int[] table;
  private int length;
  private HashFunction hashFunction;
  private TimeCalculator timeCalculator;
  private long colisionCounter = 0;

  public HashTable(int length, HashFunction hashFunction){
    this.length = length;
    this.table = new int[length];
    this.hashFunction = hashFunction;
    this.timeCalculator = new TimeCalculator();
  }

  public int getLength(){
    return this.length;
  }

  public void insert(RegisterCode registerCode){
    int value = registerCode.getCode();
    int key = hashFunction.hash(value, this.length);

    if (this.table[key] != 0) {
      this.colisionCounter++;
    }

    this.table[key] = value;
  }

  public void insertEach(RegisterCodesArray registerCodesArray){
    this.colisionCounter = 0;
    timeCalculator.start();

    for (int i = 0; i < registerCodesArray.getLength(); i++) {
      RegisterCode registerCode = registerCodesArray.getRegisterCodes()[i];
      insert(registerCode);
    }

    double duration = timeCalculator.stop();
    System.out.println("Tempo de inserção: " + duration + "ms");
    System.out.println("Colisões: " + this.colisionCounter);
  }

  public int search(RegisterCode registerCode){
    int value = registerCode.getCode();
    int key = hashFunction.hash(value, this.length);

    return this.table[key];
  }

  public void print(){
    for (int i = 0; i < this.length; i++) {
      System.out.println("{ Key: " + i + " }: { Value: " + this.table[i] + " }");
    }
  }
}
