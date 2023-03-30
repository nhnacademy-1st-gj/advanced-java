import java.util.Scanner;
import java.util.Stack;

public class ExpressionBase {
  public static String getExpression(){
    System.out.println("식을 입력하세요: ");
    Scanner sc = new Scanner(System.in);
    String expression = sc.nextLine();

    String result = toPostfix(expression);
    return result;
  }

  public static int priority(char ch){
    switch(ch){
      case'*':
      case'/':
        return 2;
      case'+':
      case'-':
        return 1;
      default:return 0;  
    }
  }

  public static String toPostfix(String expression){
    Stack<Character> stack = new Stack<Character>();
    StringBuilder sb = new StringBuilder();
    char[] c = expression.toCharArray();

    for(int i =0; i < expression.length();i++){
      int p = priority(c[i]);
      switch(c[i]){
        case'+':
        case'-':
        case'*':
        case'/':
          while(!stack.isEmpty() && priority(stack.peek())>=p){
            sb.append(stack.pop());
          }

          stack.push(c[i]);
          break;

        case')':
          while(!stack.isEmpty() && stack.peek() != '('){
            sb.append(stack.pop());
          }

          stack.pop();
          break;

        case'(':
          stack.push('(');
          break;

        default:
        sb.append(c[i]);
           
        
      }
    }
    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }

    String result = sb.toString();
    System.out.println(result);
    return result;
  }
  
}
