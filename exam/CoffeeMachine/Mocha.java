public class Mocha implements Decorator {

  private Beverage beverage;
  Liquid liquid;
  Ingredient ingredient;
  String name;

  public Mocha(String ordered,Beverage beverage,Ingredient ingredient) {
    this.name = ordered;
    this.beverage = beverage;
    this.ingredient = ingredient;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void liquid() {
  }

  @Override
  public void ingredient() {
  }

  @Override
  public void addSecondIngredient() {
    System.out.println("["+this.ingredient + "] 을/를 추가합니다.");
  }
}