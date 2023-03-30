import java.util.LinkedHashMap;
import java.util.Set;

public class Menu{

  public static LinkedHashMap<String, Integer> menu(){ 
    LinkedHashMap<String,Integer> menu = new LinkedHashMap<String,Integer>();
    menu.put("아메리카노", 1200);
    menu.put("카페라떼", 1700);
    menu.put("모카치노", 1700);
    menu.put("핫초코", 1500);
    menu.put("아이스 아메리카노", 1700);
    menu.put("아이스 초코", 1700);
    menu.put("아이스 카페라떼", 1700);
    menu.put("복숭아 아이스티", 1700);

    return menu;
  }

  public static void menuList(){ 
    Set<String> keySet = Menu.menu().keySet(); 
    int i =0;
    for (String key : keySet) {   
      System.out.println(i+". "+key + " : " + Menu.menu().get(key));     
      i++;      
    }
    System.out.println("-----------------------------------");
  }
}
