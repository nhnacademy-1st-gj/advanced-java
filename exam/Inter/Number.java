public class Number implements Expression{

  protected int number;

  public Number(int number){
    this.number = number;
  }

  @Override
  public int interpret() {
    return this.number;
  }
  
}
