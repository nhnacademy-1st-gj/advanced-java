import java.math.BigDecimal;

public abstract class Account {

  protected String accountNumber;
  protected String ownerName;
  protected BigDecimal balance;

  public synchronized BigDecimal deposit(BigDecimal amount){
    this.balance = this.balance.add(amount);
    return this.balance;
  }

  public synchronized boolean withDraw(BigDecimal amount) {
    if (amount.compareTo(this.balance) == 1 || amount.compareTo (this.balance) == 0) {
      return false;
    } else {
      balance = balance.subtract(amount);
      return true;
    }
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }
  
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
}
