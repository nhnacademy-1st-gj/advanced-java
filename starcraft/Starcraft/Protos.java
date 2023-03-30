class Zealot extends Unit{ 
  public Zealot(){
    hp=20;
    strength = 5;
    type = "ground";
    clan = "Protos";
  }
  @Override
  public String toString() {
    return "Zealot";
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
class Dragoon extends Unit{ 
  String weapon;
  public Dragoon(){
    hp=15;
    strength = 3;
    type = "ground";
    clan = "Protos";
    weapon = "laser";
  }
  @Override
  public String toString() {
    return "Dragoon";
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
class HighTempler extends Unit{ 
  public HighTempler(){
    hp=10;
    strength = 2;
    type = "ground";
    clan = "Protos";
  }
  @Override
  public String toString() {
    return "HighTempler";
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
class Scout extends Unit{ 
  public Scout(){
    hp=10;
    strength = 5;
    type = "flyable";
    clan = "Protos";
  }
  @Override
  public String toString() {
    return "Scout";
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
class Corsair extends Unit{ 
  public Corsair(){
    hp=12;
    strength = 4;
    type = "flyable";
    clan = "Protos";
  }
  @Override
  public String toString() {
    return "Corsair";
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
class Carrier extends Unit{ 
  public Carrier(){
    hp=40;
    strength = 25;
    type = "flyable";
    clan = "Protos";
  }
  @Override
  public String toString() {
    return "Carrier";
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



