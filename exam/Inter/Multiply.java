public class Multiply implements Expression{
  protected Expression left;
  protected Expression right;

  public Multiply(Expression left,Expression right){
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret() {
    return left.interpret() * right.interpret();
  }

  
}
