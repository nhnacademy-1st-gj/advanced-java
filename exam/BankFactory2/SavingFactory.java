import java.math.BigDecimal;

public class SavingFactory extends Factory{
  public static String nextSavingNumber = "0";
  
  @Override
  protected String setAccountNumber() {
    int Number = Integer.parseInt(nextSavingNumber);
    nextSavingNumber = Integer.toString(++Number);
    return "002_" + nextSavingNumber;
  }
}

class Singleton2{
  private static SavingAccount createSaving;
  private Singleton2(){}

  public static SavingAccount create(String ownerName, BigDecimal balance,int years){
    if(createSaving == null){
      createSaving = new SavingAccount(ownerName,balance,years);
    }
    return createSaving;
  }
}
  

