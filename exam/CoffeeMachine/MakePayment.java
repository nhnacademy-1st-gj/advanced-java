import java.util.InputMismatchException;
import java.util.Scanner;

public class MakePayment {
  private static MakePayment[] makePayment;
  private MakePayment(){};

  public static MakePayment getPayment(int payMethod){
    if(makePayment == null){
      makePayment = new MakePayment[] {new MakePayment(),new MakePayment(), new MakePayment()};
    }
    return makePayment[payMethod];
  } 

  public boolean payWithCreditCard(int beveragePrice){
    System.out.println("신용카드를 넣어주세요.");
    return true;
  }

  public boolean payWithOnlinePay(int beveragePrice){
    System.out.println("바코드를 인식시켜 주세요.");
    return true;
  }

  public boolean payWithCash(int beveragePrice){
    boolean payResult = false;

    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("현금을 넣어주세요.");
      int amountReceived = sc.nextInt();
      
      if(amountReceived > beveragePrice){
        int changes = amountReceived - beveragePrice;
        getChanges(changes);
        return true;
      }
      if(amountReceived == beveragePrice){
        return true;
      }
      if(amountReceived < beveragePrice){
        System.out.println("금액이 모자랍니다.");
        return false;
      }
    } catch (InputMismatchException e) {
      System.out.println("숫자만 입력해주세요");
    }
    return payResult;
  }

  public void getChanges(int changes){
		int[] coins = {500,100,50,10};
		int[] count = new int[4];
    
    System.out.print("거스름돈 "+changes+"원: ");

		for(int i =0; i<coins.length; i++){
			count[i] += changes / coins[i];
			changes %= coins[i];
      if(count[i] != 0){
        System.out.print(coins[i]+"원 "+ count[i]+"개 "); 
      }
		}	
    System.out.println("반환");
  }




  
}

