import java.util.Scanner;

abstract class Base{ //공통으로 사용되는 기능을 정의한 추상 클래스입니다.
  public int gcd(int a,int b) { //최대 공약수를 구하는 메서드입니다.
    if (b==0) {
        return a;
    }
    return gcd(b,a%b);
  }

  public void abbreviation(String calculation,int numerator, int denominator,int gcd_res){ //연산을 마친 값을 약분하여 최종 결과 값과 문구를 출력하는 메서드입니다
    gcd_res= gcd(numerator, denominator);
    numerator= numerator/gcd_res;
    denominator= denominator/gcd_res;
    System.out.println(calculation+" 결과는 "+numerator+"/"+denominator+" 입니다.");
  }

  public int[] addSubtract (int[] arr,char operator){ //파라미터로 받은 값에 따라서 더하기, 빼기 연산을 하는 메서드입니다.
    int gcd_res = gcd(arr[1], arr[3]);
    int[] res = new int[2];
    if(gcd_res == 1){
        if(operator == '+'){
            res[0]= (arr[0]*arr[3])+(arr[1]*arr[2]); 
            res[1]= arr[1]*arr[3];
        }else if(operator == '-'){
            res[0]= (arr[0]*arr[3])-(arr[1]*arr[2]); 
            res[1]= arr[1]*arr[3];
        }
    }else{
      int lcm = ((arr[1])*arr[3]/gcd_res);
      int firstNum = (lcm/arr[1]);
      int secondNum = (lcm/arr[3]);
      for(int i =0;i<arr.length;i++){
        if(i<2){
          arr[i]=arr[i]*firstNum;
        }else{
          arr[i]=arr[i]*secondNum;
        }
      }
      if(operator == '+'){
         res[0]=arr[0]+arr[2];
      }
      else if(operator == '-'){
        res[0]=arr[0]-arr[2];
      }
      if(arr[1] == arr[3]){
        res[1] = arr[1];
      }
    }
    if(operator == '+'){
        abbreviation("더하기", res[0], res[1], gcd_res);
    }if(operator == '-'){
        abbreviation("빼기", res[0], res[1], gcd_res);
    }
    return res;
  }
}

class Calc extends Base{ 
  public int[] multiply(int[] arr){ //곱하기 연산
    int[] res = new int[2];
    res[0]=arr[0]*arr[2];
    res[1]=arr[1]*arr[3];
    int gcd_res= gcd(res[0], res[1]);
    abbreviation("곱하기", res[0], res[1], gcd_res);
    return res;
  }
  public int[] divide(int[] arr){ //나누기 연산
    int[] res = new int[2];
    int temp= arr[2];
    arr[2]=arr[3];
    arr[3]=temp;
    res[0]=arr[0]*arr[2];
    res[1]=arr[1]*arr[3];
    int gcd_res= gcd(res[0], res[1]);
    abbreviation("나누기", res[0], res[1], gcd_res);
    return res;
  }
}

public class rationalNum{
  public static int[] input(){ //문자열을 배열로 바꿔주는 함수입니다.
    Scanner sc = new Scanner(System.in);
    System.out.println("유리수를 분수 형태로 입력하세요.(분자/분모 분자/분모)");
    String str = sc.nextLine();
    sc.close();
    String str_tmp = str.replace("/"," ");
    String strFinal[] = str_tmp.split(" ");
    int[] arr = new int[(strFinal.length)];
        for(int i =0; i<strFinal.length;i++){
            arr[i]=Integer.parseInt(strFinal[i]);
        }
    return arr;
  }
  public static void main(String [] args){
    Calc calc = new Calc();
    int[] arr = input();
    calc.addSubtract(arr,'+');
    calc.addSubtract(arr,'-');
    calc.multiply(arr);
    calc.divide(arr);
  }
}
