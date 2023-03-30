import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// @FunctionalInterface
// interface DescOrder{
//   public int compare(User o1, User o2);
// }

public class LambdaTest2 {
  public static int getResult(DescOrder binder, User o1, User o2){
    return binder.compare(o1, o2);
  }
  
  public static void main(String[] args){
    // DescOrder compare = (o1, o2)->{
    //   if(o1.getUserAge()>o2.getUserAge()){
    //     return -1;
    //   }else if(o1.getUserAge()<o2.getUserAge()){
    //     return 1;
    //   }else{
    //     return 0;
    //   }
    // };

    User user1 = new User(1, "User12",33);
    User user2 = new User(2, "User2",22);
    User user3 = new User(3, "User34",10);
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

     //Collections.sort(users);
    getResult(compare,user1,user2);
    for (User user : users){
      System.out.println(user);
    }
    

  }
    
}
  
  
  

