import hash_functions.DivisionRest;
import hash_functions.HashFunction;
import register_code.RegisterCodesArray;

public class App {
    public static void main(String[] args) throws Exception {
      // HASH FUNCTIONS
      HashFunction DIVISION_REST = new DivisionRest();

      // SEEDS
      int SEED = 11111;

      // HASH TABLES WITH DIVISION REST FUNCTION
      HashTable HT_1000_DIVISION_REST = new HashTable(1000, DIVISION_REST);
      HashTable HT_10000_DIVISION_REST = new HashTable(10000, DIVISION_REST);
      HashTable HT_100000_DIVISION_REST = new HashTable(100000, DIVISION_REST);

      // REGISTER CODES
      RegisterCodesArray RC_ARRAY_1_000_000 = RegisterCodesArray.generate(1000000, SEED);
      RegisterCodesArray RC_ARRAY_5_000_000 = RegisterCodesArray.generate(5000000, SEED);
      RegisterCodesArray RC_ARRAY_20_000_000 = RegisterCodesArray.generate(20000000, SEED);

      // INSERTING EACH REGISTER CODE INTO HASH TABLES
      System.out.println("############# INSERÇÃO #############");
      System.out.println("");
      System.out.println("-> FUNÇÃO DE HASH: DIVISÃO RESTO");

      System.out.println("--> Array com 1.000.000 códigos de registro");
      System.out.println("---> TABELA HASH COM 1.000 POSIÇÕES");
      System.out.println("");
      HT_1000_DIVISION_REST.insertEach(RC_ARRAY_1_000_000);
      System.out.println("");
      System.out.println("---> TABELA HASH COM 10.000 POSIÇÕES");
      System.out.println("");
      HT_10000_DIVISION_REST.insertEach(RC_ARRAY_1_000_000);
      System.out.println("");
      System.out.println("---> TABELA HASH COM 100.000 POSIÇÕES");
      System.out.println("");
      HT_100000_DIVISION_REST.insertEach(RC_ARRAY_1_000_000);
      System.out.println("");
      
      HT_1000_DIVISION_REST.resetTable();
      HT_10000_DIVISION_REST.resetTable();
      HT_100000_DIVISION_REST.resetTable();

      System.out.println("--> Array com 5.000.000 códigos de registro");
      System.out.println("---> TABELA HASH COM 1.000 POSIÇÕES");
      System.out.println("");
      HT_1000_DIVISION_REST.insertEach(RC_ARRAY_5_000_000);
      System.out.println("");
      System.out.println("---> TABELA HASH COM 10.000 POSIÇÕES");
      System.out.println("");
      HT_10000_DIVISION_REST.insertEach(RC_ARRAY_5_000_000);
      System.out.println("");
      System.out.println("---> TABELA HASH COM 100.000 POSIÇÕES");
      System.out.println("");
      HT_100000_DIVISION_REST.insertEach(RC_ARRAY_5_000_000);
      System.out.println("");

      HT_1000_DIVISION_REST.resetTable();
      HT_10000_DIVISION_REST.resetTable();
      HT_100000_DIVISION_REST.resetTable();

      System.out.println("--> Array com 20.000.000 códigos de registro");
      System.out.println("---> TABELA HASH COM 1.000 POSIÇÕES");
      System.out.println("");
      HT_1000_DIVISION_REST.insertEach(RC_ARRAY_20_000_000);
      System.out.println("");
      System.out.println("---> TABELA HASH COM 10.000 POSIÇÕES");
      System.out.println("");
      HT_10000_DIVISION_REST.insertEach(RC_ARRAY_20_000_000);
      System.out.println("");
      System.out.println("---> TABELA HASH COM 100.000 POSIÇÕES");
      System.out.println("");
      HT_100000_DIVISION_REST.insertEach(RC_ARRAY_20_000_000);
      System.out.println("");

      HT_1000_DIVISION_REST.resetTable();
      HT_10000_DIVISION_REST.resetTable();
      HT_100000_DIVISION_REST.resetTable();
    }
}
