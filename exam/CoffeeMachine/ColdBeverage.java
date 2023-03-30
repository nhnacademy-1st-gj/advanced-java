public class ColdBeverage implements ColdBase{
  Liquid liquid;
  Ingredient ingredient;
  Ingredient iceCube;
  String name;

  public ColdBeverage(String name,Liquid liquid, Ingredient ingredient){
    System.out.println("플라스틱 컵을 받으세요.");
    this.name = name;
    System.out.println("["+this.name+"] 을/를 만듭니다.");
    this.liquid = liquid;
    this.ingredient = ingredient;
  }

  @Override
  public void getIceCube() {
    System.out.println("[얼음] 이 나옵니다.");
  }

  @Override
  public void liquid() {
    System.out.println("["+this.liquid + "] 이/가 나옵니다.");
  }

  @Override
  public void ingredient() {
    System.out.println("["+this.ingredient + "] 을/를 추가합니다.");
  }

  @Override
  public String getName(){
    return this.name;
  }
  
}
