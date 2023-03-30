import java.math.BigDecimal;

public abstract class Factory {
  public final Account createAccount(String ownerName, BigDecimal balance){
    Account account = Singleton.create(ownerName, balance);
    String accountNum = setAccountNumber();
    account.setAccountNumber(accountNum);
    return account;
  }

  public final Account createAccount(String ownerName, BigDecimal balance,int years){
    Account account = Singleton2.create(ownerName, balance, years);
    String accountNum = setAccountNumber();
    account.setAccountNumber(accountNum);
    return account;
  }

  public final Account createAccount(String ownerName, BigDecimal balance,BigDecimal balanceLimit){
    Account account = Singleton3.create(ownerName, balance,balanceLimit);
    String accountNum = setAccountNumber();
    account.setAccountNumber(accountNum);
    return account;
  }

  protected abstract String setAccountNumber();
 
}