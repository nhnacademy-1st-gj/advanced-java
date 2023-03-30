import java.math.BigDecimal;

public class LimitedFactory extends Factory{
  public static String nextLimitedNumber = "0";
  
  @Override
  protected String setAccountNumber() {
    int Number = Integer.parseInt(nextLimitedNumber);
    nextLimitedNumber = Integer.toString(++Number);
    return "003_" + nextLimitedNumber;
  }
}

class Singleton3{
  private static LimitedAccount createLimited;
  private Singleton3(){}

  public static LimitedAccount create(String ownerName, BigDecimal balance,BigDecimal balanceLimit){
    if(createLimited == null){
      createLimited = new LimitedAccount(ownerName,balance,balanceLimit);
    }
    return createLimited;
  }
}
  

