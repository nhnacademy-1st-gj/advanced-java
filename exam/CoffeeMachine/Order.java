import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {
  public static String makeOrder(){ 
    String ordered =" ";

    System.out.println("주문할 음료의 번호를 입력하세요.\n");
    Menu.menuList();

    try{
      Scanner sc = new Scanner(System.in);
      int pick = sc.nextInt();

      if(pick > Menu.menu().size()-1){
        throw new IllegalArgumentException("메뉴에 있는 숫자만 입력해 주세요.");
      }

      switch(pick){
        case 0: ordered = "아메리카노";
                break;
        case 1: ordered = "카페라떼";
                break;
        case 2: ordered =  "모카치노";
                break;
        case 3: ordered =  "핫초코";
                break;
        case 4: ordered =  "아이스 아메리카노";
                break;
        case 5: ordered =  "아이스 초코";
                break;
        case 6: ordered =  "아이스 카페라떼";
                break;
        case 7: ordered =  "복숭아 아이스티";
                break;
      }
    }catch(InputMismatchException e){
      System.out.println("숫자만 입력해주세요");
    }
    System.out.println("["+ordered + " ]을/를 골랐습니다.");
    return ordered;
  }

  public static boolean payBeverage(String ordered){ 
    boolean payResult = false; 
    int beveragePrice =  Menu.menu().get(ordered);
    
    System.out.println("음료 금액: "+ beveragePrice);
    System.out.println("결제 방법을 고르세요: 0. 신용카드 1. 온라인 페이 2. 현금");

    try(Scanner sc = new Scanner(System.in)){
      int payMethod = sc.nextInt();

      if(payMethod > 2){
        throw new IllegalArgumentException("유효한 결제 방법만 선택해 주세요.");
      }
      
      switch(payMethod){
        case 0: payResult = MakePayment.getPayment(0).payWithCreditCard(beveragePrice);
                break;
        case 1 : payResult = MakePayment.getPayment(1).payWithOnlinePay(beveragePrice);
                break;
        case 2: payResult = MakePayment.getPayment(2).payWithCash(beveragePrice);
                break;
      }

      if(payResult == true){
        System.out.println("결제 완료");
      }
      else{
        System.out.println("결제 실패.");
      }

    } catch (InputMismatchException e) {
      System.out.println("숫자만 입력해주세요");
    }
    return payResult;
  }





}
