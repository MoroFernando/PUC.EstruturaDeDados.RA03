import hash_functions.HashFunction;
import linked_list.LinkedList;
import linked_list.Node;
import register_code.RegisterCode;
import register_code.RegisterCodesArray;
import utils.TimeCalculator;

public class HashTable {
  private LinkedList[] table;
  private int length;
  private HashFunction hashFunction;
  private TimeCalculator timeCalculator;
  private long colisionCounter = 0;

  public HashTable(int length, HashFunction hashFunction){
    this.length = length;
    this.table = new LinkedList[length];
    for (int i = 0; i < length; i++) {
      table[i] = new LinkedList(); // Inicializa cada posicao como uma LinkedList vazia
    }
    this.hashFunction = hashFunction;
    this.timeCalculator = new TimeCalculator();
  }

  public int getLength(){
    return this.length;
  }

  public void insert(RegisterCode registerCode){
    int value = registerCode.getCode();
    int key = hashFunction.hash(value, this.length);

    if (!this.table[key].isEmpty()) {
      this.colisionCounter++;
    }

    this.table[key].insert(registerCode);
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

    RegisterCode result = this.table[key].search(registerCode);

    return result.getCode();
  }

  public void resetTable(){
    for (int i = 0; i < this.length; i++) {
      this.table[i] = new LinkedList();
    }
  }

  public void print() {
    for (int i = 0; i < this.length; i++) {
      System.out.print("Key: " + i + " => ");
      Node current = this.table[i].getHead();

      if (current == null) {
        System.out.println("Empty");
        continue;
      }

      while (current != null) {
        System.out.print(current.getRegisterCode().getCode() + " -> ");
        current = current.getNext();
      }
      System.out.println("null");
    }
  }
}
