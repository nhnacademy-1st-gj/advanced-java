public class GroundUnit extends Unit implements Groundable, Attackable{
  public GroundUnit(int hp, int attackPower, String name,Brood brood){
    super(hp, attackPower, name);
    this.brood = brood;
  }

  @Override
  public boolean attack(Unit unit) {
    if(unit instanceof Groundable){
      unit.hp -= this.power;
      return true;
    }else{
      System.out.println("공격에 실패했습니다.");
      return false;
    }
    
  }
}
