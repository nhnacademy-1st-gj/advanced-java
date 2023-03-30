import java.util.InputMismatchException;
import java.util.Scanner;

public class Starcraft {
    public static void main (String[] args){
    makeClang makeClang = new makeClang();
    System.out.println("종족을 고르세요: 1.테란 2.프로토스 3.저그");
    
    try (Scanner scanner = new Scanner(System.in);) {
      int clang= scanner.nextInt();
    
      int computerClang = (int)(Math.random()*2)+1;
      Unit[] myUnit = makeClang.makeMyClang(clang);
      Unit[] computerUnit = makeClang.makeComputerClang(computerClang);
      boolean result = true;

      while(result){
      System.out.println("공격을 수행할 아군 유닛과 적군 유닛의 숫자를 선택하세요. ");
      int myNum=scanner.nextInt();
      int targetNum=scanner.nextInt();
      int computerNum, computerTargetNum;
      computerNum =(int)(Math.random()*computerUnit.length);
      computerTargetNum =(int)(Math.random()*myUnit.length);

      if(myUnit[myNum].getHp() > 0){
        myUnit[myNum].attck(computerUnit[targetNum]);
      }else{
        continue;
      }
      if(computerUnit[computerNum].getHp() > 0){
        computerUnit[computerNum].attck(myUnit[computerTargetNum]);
      }else{
        continue;
      }

      System.out.println("아군");
      for(int i =0 ; i<myUnit.length;i++){
        if(myUnit[i].getHp() <= 0){
          continue;
        }
        System.out.println(i+"."+ myUnit[i]+"(현재 방어력: "+myUnit[i].getHp()+")");
      }
      System.out.print("\n");

      System.out.println("적군");
      for(int i =0 ; i<computerUnit.length;i++){
        if(computerUnit[i].getHp() <= 0){
          continue;
        }
        System.out.println(i+"."+ computerUnit[i]+"(현재 방어력: "+computerUnit[i].getHp()+")");
      }

      int resultMyCheck=myUnit.length; 
      int resultComputerCheck=computerUnit.length; 

      for(int i =0;i<resultMyCheck;i++){
        if(myUnit[i].getHp() == 0){
          resultMyCheck -= 1;
        }
      }
      for(int i =0;i<resultComputerCheck;i++){
        if(computerUnit[i].getHp() == 0){
          resultComputerCheck -= 1;
        }
      }
      if(resultMyCheck==0){
        System.out.println("적군의 승리!");
        result = false;
      }
      if(resultComputerCheck==0){
        System.out.println("아군의 승리!");
        result = false;
      }
    }
    
} catch (InputMismatchException e) {
  System.out.println("숫자만 입력해주세요.");
}

}


}
