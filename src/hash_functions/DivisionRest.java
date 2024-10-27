package hash_functions;

public class DivisionRest implements HashFunction {
  public int hash(int value, int tableLength){
    return value % tableLength;
  }
}
