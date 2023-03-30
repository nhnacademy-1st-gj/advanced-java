public abstract class Unit {
  protected int hp;
  protected int power;
  protected String name;
  protected Brood brood;

  public Unit(int hp, int power, String name){
    this.hp = hp;
    this.power = power;
    this.name = name;
  }

  public int getHp(){
    return this.hp;
  }

  public int getPower(){
    return this.power;
  }

  public String getName(){
    return this.name;
  }

  
}
