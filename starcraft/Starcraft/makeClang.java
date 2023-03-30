
public class makeClang {
  public Unit[] makeMyClang(int clang){
    Unit[] myUnit = new Unit[5];
    if(clang == 1){
      System.out.println("아군: 테란");
      Unit[] unitTerran = {new Marine(),new Tank(),new Goliath(), new Wraith(),new Valkyrie(),new BattleCruzer()};
      myUnit = new Unit[5];
      for(int i =0;i<myUnit.length;i++){
        myUnit[i]=unitTerran[(int)(Math.random()*4)]; //같은 객체를 참조하지 않게 새로운 객체를 만들어주고 싶은데 해결 방법을 모르겠습니다.. 
      }
    }
    if(clang == 2){
      System.out.println("아군: 프로토스");
      Unit[] unitProtos = {new Zealot(),new Dragoon(),new HighTempler(), new Scout(),new Corsair(),new Carrier()};
      myUnit = new Unit[4];
      for(int i =0;i<myUnit.length;i++){
        myUnit[i]=unitProtos[(int)(Math.random()*4)];
      }
    }
    if(clang == 3){
      System.out.println("아군: 저그");
      Unit[] unitZerg = {new Zergling(),new Hydralisk(),new Ultralisk(), new Mutalisk(),new Guardian(),new Queen()};
      myUnit = new Unit[8];
      for(int i =0;i<myUnit.length;i++){
        myUnit[i]=unitZerg[(int)(Math.random()*4)];
      }
    }
    for(int i =0 ; i<myUnit.length;i++){
      System.out.println(i+"."+ myUnit[i]+"(현재 방어력: "+myUnit[i].getHp()+")");
    }
    System.out.println("\n");
    return myUnit;
  }
  public Unit[] makeComputerClang(int computerClang){
    Unit[] computerUnit = new Unit[5];
    if(computerClang == 1){
      System.out.println("적군: 테란");
      Unit[] unitTerran = {new Marine(),new Tank(),new Goliath(), new Wraith(),new Valkyrie(),new BattleCruzer()};
      computerUnit = new Unit[5];
      for(int i =0;i<computerUnit.length;i++){
        computerUnit[i]=unitTerran[(int)(Math.random()*4)];
      }
    }
    if(computerClang == 2){
      System.out.println("적군: 프로토스");
      Unit[] unitProtos = {new Zealot(),new Dragoon(),new HighTempler(), new Scout(),new Corsair(),new Carrier()};
      computerUnit = new Unit[4];
      for(int i =0;i<computerUnit.length;i++){
        computerUnit[i]=unitProtos[(int)(Math.random()*4)];
      }
    }
    if(computerClang == 3){
      System.out.println("적군: 저그");
      Unit[] unitZerg = {new Zergling(),new Hydralisk(),new Ultralisk(), new Mutalisk(),new Guardian(),new Queen()};
      computerUnit = new Unit[8];
      for(int i =0;i<computerUnit.length;i++){
        computerUnit[i]=unitZerg[(int)(Math.random()*4)];
      }
    }
    for(int i =0 ; i<computerUnit.length;i++){
      System.out.println(i+"."+ computerUnit[i]+"(현재 방어력: "+computerUnit[i].getHp()+")");
    }
    System.out.println("\n");
    return computerUnit;
  }
}
