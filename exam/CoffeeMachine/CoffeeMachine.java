
public class CoffeeMachine {
  public static void main(String[] args){
    Factory factory = new BeverageFactory();
    String ordered  = Order.makeOrder();
    boolean orderResult =  Order.payBeverage(ordered);
    
    if(orderResult){
      Beverage beverage = factory.make(ordered);
      System.out.println(beverage.getName()+" 완성. 맛있게 드세요. ");
      
    }else{
      System.out.println("처음부터 다시 주문해 주세요.");
    }
  }
  
}
