public class App {
  public static void main(String[] args){
    String expression = ExpressionBase.getExpression();
    int result = Evaluator.parse(expression);
    System.out.println(result);
  }
}
