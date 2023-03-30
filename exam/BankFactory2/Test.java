import java.math.BigDecimal;

public class Test {
  public static void main (String[] args){

    Factory general = new GeneralFactory();
    Factory limited = new LimitedFactory();
    Factory saving = new SavingFactory();


    Account generalTest =  general.createAccount("Kurt", new BigDecimal(100));
    System.out.println(generalTest.getAccountNumber()+","+generalTest.getOwnerName()+","+generalTest.getBalance());
    Account generalTest2 =  general.createAccount("Kurt2", new BigDecimal(100));
    System.out.println(generalTest2.getAccountNumber()+","+generalTest2.getOwnerName()+","+generalTest2.getBalance());

    Account savingTest = saving.createAccount("Chris", new BigDecimal(100), 1);
    Account savingTest2 = saving.createAccount("Chris2", new BigDecimal(100), 1);

    Account limitedTest = limited.createAccount("Dave", new BigDecimal(100), new BigDecimal(1000));
    Account limitedTest2 = limited.createAccount("Dave2", new BigDecimal(100), new BigDecimal(1000));


  }

  
}
