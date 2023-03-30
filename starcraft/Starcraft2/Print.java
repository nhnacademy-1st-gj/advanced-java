import java.util.ArrayList;

public class Print {
  public static void printUnits(ArrayList<Unit> units) {
    for(int i = 0; i < units.size(); i++) {
        if (units.get(i) != null)
            System.out.println(i + "." + units.get(i).getName() + " (현재 방어력: " + units.get(i).getHp() + ", 공격력: " + units.get(i).getPower() + ")");
    }
}
}
