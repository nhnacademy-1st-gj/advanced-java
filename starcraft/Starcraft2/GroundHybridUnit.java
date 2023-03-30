public class GroundHybridUnit extends Unit implements Groundable,Attackable{
  public GroundHybridUnit(int hp, int attackPower, String name,Brood brood){
    super(hp, attackPower, name);
    this.brood = brood;
  }

  @Override
  public boolean attack(Unit unit) {
    unit.hp -= this.power;
    return true;
  }
}
