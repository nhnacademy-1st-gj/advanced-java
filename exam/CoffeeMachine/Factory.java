public abstract class Factory {
  public final Beverage makeBeverage(String ordered) {
    Beverage beverage = make(ordered);
    return beverage;
  }
  protected abstract Beverage make(String ordered); 
}
