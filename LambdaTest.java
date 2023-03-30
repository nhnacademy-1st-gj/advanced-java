import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest {
  public static void main(String[] args){
    User user1 = new User(1, "User12",30);
    User user2 = new User(2, "User2",22);
    User user3 = new User(3, "User34",14);
    User user4 = new User(4, "User4",20);
    User user5 = new User(5, "User5",30);

    List<User> users = new ArrayList<User>(){ 
        {
            add(user1);
            add(user2);
            add(user3);
            add(user4);
            add(user5);
        }
     };

     Collections.sort(users,(s1, s2)->s2.getUserAge() - s1.getUserAge());

    for (User user : users){
      System.out.println(user);
    }
  }
  
}
