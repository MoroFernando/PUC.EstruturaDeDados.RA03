import hash_functions.DivisionRest;
import hash_functions.HashFunction;
import register_code.RegisterCode;
import register_code.RegisterCodesArray;

public class App {
    public static void main(String[] args) throws Exception {
      // HASH FUNCTIONS
      HashFunction DIVISION_REST = new DivisionRest();

      // SEEDS
      int SEED = 11111;

      // HASH TABLES WITH DIVISION REST FUNCTION
      HashTable HT_100_DIVISION_REST = new HashTable(100, DIVISION_REST);

      // REGISTER CODES
      System.out.println("Gerando arrays de códigos de registro...");
      RegisterCodesArray RC_ARRAY_10_000 = RegisterCodesArray.generate(10000, SEED);

      // INSERTING EACH REGISTER CODE INTO HASH TABLES
      System.out.println("Inserindo códigos de registro nas tabelas hash...");
      HT_100_DIVISION_REST.insertEach(RC_ARRAY_10_000);

      // SEARC THE 5 FIRST REGISTER CODE FOR EACH ARRAY
      System.out.println("Buscando os 5 primeiros códigos de registro de cada array nas tabelas hash...");
      HT_100_DIVISION_REST.search(RC_ARRAY_10_000.getRegisterCodes()[0]);
      HT_100_DIVISION_REST.search(RC_ARRAY_10_000.getRegisterCodes()[1]);
      HT_100_DIVISION_REST.search(RC_ARRAY_10_000.getRegisterCodes()[2]);
      HT_100_DIVISION_REST.search(RC_ARRAY_10_000.getRegisterCodes()[3]);
      HT_100_DIVISION_REST.search(RC_ARRAY_10_000.getRegisterCodes()[4]);
    }
}
