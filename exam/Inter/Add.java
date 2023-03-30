public class Add implements Expression{
  protected Expression left;
  protected Expression right;

  public Add(Expression left,Expression right){
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret() {
    return left.interpret() + right.interpret();
  }

  
}
