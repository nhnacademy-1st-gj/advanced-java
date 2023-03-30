public class Divide implements Expression{
  protected Expression left;
  protected Expression right;

  public Divide(Expression left,Expression right){
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret() {
    return left.interpret() / right.interpret();
  }

  
}
