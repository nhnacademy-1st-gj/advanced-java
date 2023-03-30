import java.util.Comparator;
@FunctionalInterface
interface IDescOrder{
  public int compare(User o1, User o2);
}

public class DescOrder implements Comparator<User>{

  @Override
  public int compare(User o1, User o2) {
    if(o1.getUserAge()>o2.getUserAge()){
      return -1;
    }else if(o1.getUserAge()<o2.getUserAge()){
      return 1;
    }else{
      return 0;
    }
  }
    
}
