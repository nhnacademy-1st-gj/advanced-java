public class BeverageFactory extends Factory{

  @Override
  protected Beverage make(String ordered) {
    Beverage beverage = null;
    
    switch(ordered){
      case "아메리카노":
        beverage = new HotBeverage(ordered, Liquid.HotWater, Ingredient.EspressoShot);
        beverage.liquid();
        beverage.ingredient();
        return beverage;
      case "카페라떼":
        beverage = new HotBeverage(ordered, Liquid.SteamMilk, Ingredient.EspressoShot);
        beverage.liquid();
        beverage.ingredient();
        return beverage;
      case "모카치노":
        Beverage base = new HotBeverage(ordered, Liquid.SteamMilk, Ingredient.EspressoShot);
        beverage = new Mocha(ordered,base, Ingredient.Choco);
        base.liquid();
        base.ingredient();
        ((Mocha) beverage).addSecondIngredient();
        return beverage;
      case "핫초코":
        beverage = new HotBeverage(ordered, Liquid.SteamMilk, Ingredient.Choco);
        beverage.liquid();
        beverage.ingredient();
        return beverage;
      case "아이스 아메리카노":
        beverage = new ColdBeverage(ordered, Liquid.ColdWater, Ingredient.EspressoShot);
        ((ColdBeverage) beverage).getIceCube();
        beverage.liquid();
        beverage.ingredient();
        return beverage;
      case "아이스 초코":
        beverage = new ColdBeverage(ordered, Liquid.ColdMilk, Ingredient.Choco);
        ((ColdBeverage) beverage).getIceCube();
        beverage.liquid();
        beverage.ingredient();
        return beverage;
      case "아이스 카페라떼":
        beverage = new ColdBeverage(ordered, Liquid.ColdMilk, Ingredient.EspressoShot);
        ((ColdBeverage) beverage).getIceCube();
        beverage.liquid();
        beverage.ingredient();
        return beverage;
      case "복숭아 아이스티":
        beverage = new ColdBeverage(ordered, Liquid.ColdWater, Ingredient.IceTeaPowder);
        ((ColdBeverage) beverage).getIceCube();
        beverage.liquid();
        beverage.ingredient();
        return beverage;
    }
    return beverage;
  }
  
}
