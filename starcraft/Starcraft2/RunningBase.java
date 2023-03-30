import java.util.ArrayList;

public class RunningBase {
  public static void myAttack(ArrayList<Unit> myUnits, ArrayList<Unit> computerUnits, int myNum, int targetNum){
    Unit myUnit = myUnits.get(myNum);

    if (myUnit instanceof Attackable) {
      ((Attackable)myUnit).attack(computerUnits.get(targetNum));
    } else {
        System.out.println("공격에 실패했습니다.");
    }
  }

  public static int[] computerAttack(ArrayList<Unit> computerUnits, ArrayList<Unit> myUnits){
    int computerNum =(int)(Math.random()*computerUnits.size());
    int computerTargetNum =(int)(Math.random()*myUnits.size());
    Unit computerUnit = computerUnits.get(computerNum);
    
    if (computerUnit instanceof Attackable) {
      ((Attackable)computerUnit).attack(myUnits.get(computerTargetNum));
    } else {
        System.out.println("공격에 실패했습니다.");
    }
    return new int[] {computerNum, computerTargetNum};
  }

  public static void removeUnit(ArrayList<Unit> myUnits, ArrayList<Unit> computerUnits) {
    for (int i = 0; i < myUnits.size(); i++) {
        if (!myUnits.isEmpty()) {
            Unit unit = myUnits.get(i);
            if (unit.getHp() <= 0) {
              myUnits.remove(i);
            }
        }
    }
    for (int i = 0; i < computerUnits.size(); i++) {
        if (!computerUnits.isEmpty()) {
            Unit unit = computerUnits.get(i);
            if (unit.getHp() <= 0) {
              computerUnits.remove(i);
            }
        }
    }
}

  public static boolean winner(ArrayList<Unit> myUnits, ArrayList<Unit> computerUnits){
    if(myUnits.size()==0){
      System.out.println("적군의 승리");
      return false;
    }else if(computerUnits.size()==0){
      System.out.println("아군의 승리");
      return false;
    }
    return true;
  }

  
}
