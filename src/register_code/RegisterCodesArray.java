package register_code;

import java.util.Random;
import java.util.stream.IntStream;

public class RegisterCodesArray {
  private RegisterCode[] registerCodes;

  private RegisterCodesArray(RegisterCode[] registerCodes){
    this.registerCodes = registerCodes;
  }

  public RegisterCode[] getRegisterCodes(){
    return this.registerCodes;
  }

  public int getLength(){
    return this.registerCodes.length;
  }

  public static RegisterCodesArray generate(int arrayLength, int seed){
    Random random = new Random(seed);

    RegisterCode[] registerCodesArray = IntStream.range(0, arrayLength)
      .mapToObj(i -> new RegisterCode(100000000 + random.nextInt(900000000)))
      .toArray(RegisterCode[]::new);

    return new RegisterCodesArray(registerCodesArray);
  }

  public void print(){
    for(int i = 0; i < this.registerCodes.length; i++){
      System.out.println(this.registerCodes[i].getCode());
    }
  }
}
