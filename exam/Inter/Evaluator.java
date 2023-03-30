import java.util.Stack;

public class Evaluator{
  public static int parse(String expression){
    Stack<Expression> stack = new Stack<Expression>();

    String[] word = expression.split("");
    for(String one : word){
      Expression left=null;
      Expression right=null;

      switch(one){
        case "+":
          right = stack.pop();
          left = stack.pop();
          stack.push(new Add(left, right));
          break;
        case "-":
          right = stack.pop();
          left = stack.pop();
          stack.push(new Substract(left, right));
          break;
        case "*":
          right = stack.pop();
          left = stack.pop();
          stack.push(new Multiply(left, right));
          break;
        case "/":
          right = stack.pop();
          left = stack.pop();
          stack.push(new Divide(left, right));
          break;
        default:
          int number = Integer.parseInt(one);
          stack.push(new Number(number));
          break;
      }
    }
    int result= stack.pop().interpret();
    return result;
  }

}

  