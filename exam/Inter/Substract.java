public class Substract implements Expression{
  protected Expression left;
  protected Expression right;

  public Substract(Expression left,Expression right){
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret() {
    return left.interpret() - right.interpret();
  }

  
}
