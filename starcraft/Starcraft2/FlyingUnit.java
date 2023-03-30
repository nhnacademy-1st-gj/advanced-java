public class FlyingUnit extends Unit implements Flyable,Attackable{
  public FlyingUnit(int hp, int attackPower, String name,Brood brood){
    super(hp, attackPower, name);
    this.brood = brood;
  }

  @Override
  public boolean attack(Unit unit) {
    unit.hp -= this.power;
    return true;
  }
}
