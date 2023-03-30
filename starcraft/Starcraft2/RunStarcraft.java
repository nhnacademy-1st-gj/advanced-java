import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RunStarcraft {
  Scanner scanner = new Scanner(System.in);

  Brood myBrood;
  Brood computerBrood;

  ArrayList<Unit> myUnits;
  ArrayList<Unit> computerUnits;
  public static void main(String[] args){
    RunStarcraft run = new RunStarcraft();
    run.start();
    while(RunningBase.winner(run.myUnits, run.computerUnits)){
      run.printBattleState();
      run.myAttack();
      System.out.println();
      run.computerAttack();

    }

  }

  public void start(){
    System.out.println("게임을 시작합니다.");
    System.out.println("종족을 고르세요: 0.테란 1.프로토스 2.저그");
    int brood = scanner.nextInt();
    this.myBrood = Brood.values()[brood];
    int computerBrood = (int)(Math.random()*2);
    this.computerBrood = Brood.values()[computerBrood];

    MakeBroodUnit makeBroodUnit = new MakeBroodUnit();
    myUnits = makeBroodUnit.makeUnit(brood);
    computerUnits = makeBroodUnit.makeUnit(computerBrood);
  }

  public void myAttack(){
    try{
      System.out.println("내 유닛을 고르세요");
      int myAttack = scanner.nextInt();
      System.out.println("공격할 상대 유닛을 고르세요");
      int attackTarget = scanner.nextInt();

      RunningBase.myAttack(myUnits, computerUnits, myAttack, attackTarget);
      RunningBase.removeUnit(myUnits,computerUnits);
    }catch (NullPointerException e) {
      System.out.println("존재하지 않는 유닛입니다");
      e.printStackTrace();
    }catch (InputMismatchException e) {
      System.out.println("숫자만 입력해주세요.");
    }
  }

  public void computerAttack() {
    System.out.println("컴퓨터의 차례.");
    int[] result = RunningBase.computerAttack(computerUnits, myUnits);
    System.out.println(result[0] + "번 유닛이 " + result[1] + " 번 유닛을 공격했습니다."); 
    RunningBase.removeUnit(this.myUnits, this.computerUnits);
    System.out.println();
  }
  public void printBattleState() {
    System.out.println("적군: " + this.computerBrood.name());
    Print.printUnits(computerUnits);
    System.out.println();
    System.out.println("아군: "  + this.myBrood.name());
    Print.printUnits(myUnits);
}







}
