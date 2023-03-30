
class Marine extends Unit { 
  public Marine(){
    hp=10;
    strength = 3;
    type = "ground";
    clan = "Terran";
  }
  @Override
  public String toString() {
    return "Marine";
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

class Tank extends Unit{
  public Tank(){
  hp=15;
  strength = 7;
  type = "ground";
  clan = "Terran";
    }
  @Override
  public String toString() {
    return "Tank";
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

class Goliath extends Unit{
  String weapon;
  public Goliath(){
    hp=15;
    strength = 5;
    type = "weapon";
    clan = "Terran";
    weapon = "missile";
  }
  @Override
  public String toString() {
    return "Goliath";
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

class Wraith extends Unit{
public Wraith(){
  hp=10;
  strength = 3;
  type = "flyable";
  clan = "Terran";
}
  @Override
  public String toString() {
    return "Wraith";
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

class Valkyrie extends Unit{
  public Valkyrie(){
    hp=12;
    strength = 4;
    type = "flyable";
    clan = "Terran";
  }
  @Override
  public String toString() {
    return "Valkyrie";
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

class BattleCruzer extends Unit{
  public BattleCruzer(){
    hp=30;
    strength = 20;
    type = "flyable";
    clan = "Terran";
  }
  @Override
  public String toString() {
    return "BattleCruzer";
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


