abstract class Unit implements Attackable{
  protected int hp; //방어력
  protected int strength; //공격력
  protected String type; //비행, 지상, 무기
  protected String clan; //종족

  public void setHp(int hp){
    this.hp = hp;
  }
  public int getHp(){
    return this.hp;
  }
  public int getStrength(){
    return this.strength;
  }
  public String getType(){
    return this.type;
  }
}