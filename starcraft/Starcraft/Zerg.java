class Zergling extends Unit{
  public Zergling(){
    hp=2;
    strength = 2;
    type = "ground";
    clan = "Zerg";
  }
  @Override
  public String toString() {
    return "Zergling";
  }

  @Override
  public void attck(Unit u) {
    String target = u.getType();
    if(target.equals("flyable")){
      System.out.println("공격 불가");
    }
    int afterDamage = u.getHp()-this.strength;
    if(afterDamage <=0){
      u.setHp(0);
    }
    u.setHp(afterDamage);
  }
}
class Hydralisk extends Unit{
  String weapon;
  public Hydralisk(){
    hp=7;
    strength = 3;
    type = "ground";
    clan = "Zerg";
    weapon = "spine";
  }
  @Override
  public String toString() {
    return "Hydralisk";
  }

  @Override
  public void attck(Unit u) {
    String target = u.getType();
    if(target.equals("flyable")){
      System.out.println("공격 불가");
    }
    int afterDamage = u.getHp()-this.strength;
    if(afterDamage <=0){
      u.setHp(0);
    }
    u.setHp(afterDamage);
  }
}
class Ultralisk extends Unit{
  public Ultralisk(){
    hp=15;
    strength = 5;
    type = "ground";
    clan = "Zerg";
  }
  @Override
  public String toString() {
    return "Ultralisk";
  }

  @Override
  public void attck(Unit u) {
    String target = u.getType();
    if(target.equals("flyable")){
      System.out.println("공격 불가");
    }
    int afterDamage = u.getHp()-this.strength;
    if(afterDamage <=0){
      u.setHp(0);
    }
    u.setHp(afterDamage);
  }
}
class Mutalisk extends Unit {
  public Mutalisk(){
    hp=8;
    strength = 2;
    type = "flyable";
    clan = "Zerg";
  }
  @Override
  public String toString() {
    return "Mutalisk";
  }

  @Override
  public void attck(Unit u) {
    int afterDamage = u.getHp()-this.strength;
    if(afterDamage <=0){
      u.setHp(0);
    }
    u.setHp(afterDamage);
}
}
class Guardian extends Unit {
  public Guardian(){
    hp=6;
    strength = 3;
    type = "flyable";
    clan = "Zerg";
  }
  @Override
  public String toString() {
    return "Guardian";
  }

  @Override
  public void attck(Unit u) {
    int afterDamage = u.getHp()-this.strength;
    if(afterDamage <=0){
      u.setHp(0);
    }
    u.setHp(afterDamage);
  }
}

class Queen extends Unit {
  public Queen(){
    hp=25;
    strength = 15;
    type = "flyable";
    clan = "Zerg";
  }
  @Override
  public String toString() {
    return "Queen";
  }

  @Override
  public void attck(Unit u) {
    int afterDamage = u.getHp()-this.strength;
    if(afterDamage <=0){
      u.setHp(0);
    }
    u.setHp(afterDamage);
  }
}

