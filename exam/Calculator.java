import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;

public class Calculator {
  public List<String> parsing(String expression, String pattern){
    String[] temp = expression.split(" ");
    List<String> result = new ArrayList<>();
    for(String element : temp){
      result.add(element);
    }
    return result;
  }

  public static int priority(String elemnt){
    switch(elemnt){
      case"*":
      case"/":
        return 2;
      case"+":
      case"-":
        return 1;
      default:return 0;  
    }
  }
  public String infixToPostfix(String expression, String pattern){
    List<String> afterParse = parsing(expression, pattern);
    String result = "";
    if(pattern.equals("prefix")){
      Stack<String> stack = new Stack<String>();
      StringBuilder sb = new StringBuilder();

      for(String element : afterParse){
        int priority = priority(element);
        switch(element){
          case"*":
          case"/":
          case"+":
          case"-":
            while(!stack.isEmpty() && priority(stack.peek())>=priority){
              sb.append(stack.pop());
              sb.append(" ");
            }
            stack.push(element);
            break;

          case")":
            while(!stack.isEmpty() && stack.peek() != "("){
              sb.append(stack.pop());
              sb.append(" ");
            }
            stack.pop();
            break;

          case"(":
            stack.push("(");
            break;

          default:
            sb.append(element);
            sb.append(" ");
        }
      }
      while(!stack.isEmpty()){
        sb.append(stack.pop());
      }
      result = sb.toString();
    }
    return result;
  }

  /*
  public static <T extends MyNumber> T run(String expression, String pattern, Function<String,T> converter){
    MyInteger myInt = new MyInteger();
    Stack<MyInteger> stack = new Stack<MyInteger>();
    String[] word = expression.split("");
    for(String one : word){
      MyInteger left=null;
      MyInteger right=null;

      switch(one){
        case "+":
          right = stack.pop();
          left = stack.pop();
         
          stack.push(myInt.plus(operand));
          break;
        case "-":
          right = stack.pop();
          left = stack.pop();
          stack.push(myInt.minus(operand));
          break;
        case "*":
          right = stack.pop();
          left = stack.pop();
          stack.push(myInt.multipliedBy(operand));
          break;
        case "/":
          right = stack.pop();
          left = stack.pop();
          stack.push(myInt.dividedBy(operand));
          break;
        default:
          int number = Integer.parseInt(one);
          stack.push(new MyInteger(number));
          break;
      }
      }

    return null;
  }
  */

}
