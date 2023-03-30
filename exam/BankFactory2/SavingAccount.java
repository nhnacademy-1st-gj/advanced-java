import java.math.BigDecimal;
import java.time.LocalDate;

public class SavingAccount extends Account{
  private LocalDate Date = LocalDate.now(); 
  private LocalDate endDate;
  public SavingAccount(String ownerName, BigDecimal balance,int years) {
    this.ownerName = ownerName;
    this.balance = balance;
    endDate = Date.plusYears(years);
  }

  public boolean earlyTermination(Account account){
    System.out.println("Closing your account.\nRemaining balance: "+ account.getBalance());
    boolean result = withDraw(this.balance);
    return result;
  }

  public LocalDate getEndData() {
    return this.endDate;
  }

  @Override
  public boolean withDraw(BigDecimal amount) {
    balance = balance.subtract(amount);
    return true;
  }

  
  
}
