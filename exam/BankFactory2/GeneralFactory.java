import java.math.BigDecimal;

public class GeneralFactory extends Factory{
  public static String nextGeneralNumber = "0";
  
  @Override
  protected String setAccountNumber() {
    int Number = Integer.parseInt(nextGeneralNumber);
    nextGeneralNumber = Integer.toString(++Number);
    return "001_" + nextGeneralNumber;
  }
}

class Singleton{
  private static GeneralAccount createGeneral;
  private Singleton(){}

  public static GeneralAccount create(String ownerName, BigDecimal balance){
    if(createGeneral == null){
      createGeneral = new GeneralAccount(ownerName,balance);
    }
    return createGeneral;
  }
}
  

