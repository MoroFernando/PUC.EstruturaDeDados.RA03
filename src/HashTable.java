import hash_functions.HashFunction;
import register_code.RegisterCode;
import register_code.RegisterCodesArray;

public class HashTable {
  private int[] table;
  private int length;
  private HashFunction hashFunction;

  public HashTable(int length, HashFunction hashFunction){
    this.length = length;
    this.table = new int[length];
    this.hashFunction = hashFunction;
  }

  public int getLength(){
    return this.length;
  }

  public void insert(RegisterCode registerCode){
    int value = registerCode.getCode();
    int key = hashFunction.hash(value, this.length);

    this.table[key] = value;
  }

  public void insertEach(RegisterCodesArray registerCodesArray){
    for (int i = 0; i < registerCodesArray.getLength(); i++) {
      RegisterCode registerCode = registerCodesArray.getRegisterCodes()[i];
      insert(registerCode);
    }
  }

  public int search(RegisterCode registerCode){
    int value = registerCode.getCode();
    int key = hashFunction.hash(value, this.length);

    return this.table[key];
  }

  public void print(){
    for (int i = 0; i < this.length; i++) {
      System.out.println("{ Key: " + i + "}: { Value: " + this.table[i] + " }");
    }
  }
}
