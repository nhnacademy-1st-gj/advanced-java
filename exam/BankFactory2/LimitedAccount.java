import java.math.BigDecimal;

public class LimitedAccount extends Account{
  private BigDecimal balanceLimit;

  public LimitedAccount(String ownerName, BigDecimal balance,BigDecimal balanceLimit) {
    this.ownerName = ownerName;
    this.balance = balance;
    this.balanceLimit = balanceLimit;
  }

  public BigDecimal getBalanceLimit() {
    return this.balanceLimit;
  } 


  
}
