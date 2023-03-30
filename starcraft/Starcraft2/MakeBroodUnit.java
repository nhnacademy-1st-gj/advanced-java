import java.util.ArrayList;

public class MakeBroodUnit {
  public ArrayList<Unit> makeUnit(int broodChoice){
    
    ArrayList<Unit> units = new ArrayList<>();

    if(broodChoice == 0){
      units = new ArrayList<>(5); 
      for(int i =0 ; i<5;i++){
        int unitSelect = (int)(Math.random()*6);
        units.add(makeTerranUnit(unitSelect));
      }
    }
    if(broodChoice == 1){
      units = new ArrayList<>(4); 
      for(int i =0 ; i<4;i++){
        int unitSelect = (int)(Math.random()*6);
        units.add(makeProtosUnit(unitSelect));
      }
    }
    if(broodChoice == 2){
      units = new ArrayList<>(8); 
      for(int i =0 ; i<8;i++){
        int unitSelect = (int)(Math.random()*6);
        units.add(makeZergUnit(unitSelect));
      }
    }

    return units;
  }

    private Unit makeTerranUnit(int unitSelect){
      switch(unitSelect){
        case 0: 
            return new GroundUnit(10, 3, "Marine", Brood.Terran);
        case 1:
            return new GroundUnit(15, 7, "Tank", Brood.Terran);
        case 2:
            return new GroundHybridUnit(15, 5, "Goliath", Brood.Terran);
        case 3:
            return new FlyingUnit(10, 3, "Wraith", Brood.Terran);
        case 4:
            return new FlyingUnit(12, 4, "Valkyrie", Brood.Terran);
        case 5:
            return new FlyingUnit(30, 20, "BattleCruzer", Brood.Terran);
        default:
            return null;
    }
  }

    private Unit makeProtosUnit(int unitSelect){
      switch(unitSelect){
        case 0: 
            return new GroundUnit(20, 5, "Zealot", Brood.Protos);
        case 1:
            return new GroundHybridUnit(15, 3, "Dragoon", Brood.Protos);
        case 2:
            return new GroundUnit(10, 2, "HighTempler", Brood.Protos);
        case 3:
            return new FlyingUnit(10, 5, "Scout", Brood.Protos);
        case 4:
            return new FlyingUnit(12, 4, "Corsair", Brood.Protos);
        case 5:
            return new FlyingUnit(25, 12, "Carrier", Brood.Protos);
        default:
            return null;
       }
    }

    private Unit makeZergUnit(int unitSelect){
      switch(unitSelect){
        case 0: 
            return new GroundUnit(2, 2, "Zergling", Brood.Zerg);
        case 1:
            return new GroundHybridUnit(7, 3, "Hydralisk", Brood.Zerg);
        case 2:
            return new GroundUnit(15, 5, "Ultralisk", Brood.Zerg);
        case 3:
            return new FlyingUnit(8, 2, "Mutalisk", Brood.Zerg);
        case 4:
            return new FlyingUnit(6, 3, "Guardian", Brood.Zerg);
        case 5:
            return new FlyingUnit(25, 15, "Queen", Brood.Zerg);
        default:
            return null;
      }
    }




  
}
