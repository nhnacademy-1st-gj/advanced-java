public class RationalNumber extends MyNumber implements Comparable<RationalNumber>{
  private int molecule; 
  private int denominator; 

  public int getMolecule(){
    return this.molecule;
  }
  public int getDenominator(){
    return this.denominator;
  }

  public RationalNumber(int molecule){
    this.molecule = molecule;
    this.denominator = 1;
  }

  public RationalNumber(int molecule, int denominator){
    int[] abbreviationResult= abbreviation(molecule, denominator);
    this.molecule = abbreviationResult[0];
    this.denominator = abbreviationResult[1];
  }

  public RationalNumber(RationalNumber rationlaObject){
    this.molecule = rationlaObject.getMolecule();
    this.denominator = rationlaObject.getDenominator();
    
  }

  @Override
  public String toString() {
    String returnMolecule = Integer.toString(molecule);
    String returnDenominator = Integer.toString(denominator);
    if(denominator == 1){
      return returnMolecule;
    }
    else{
      return returnMolecule + "/" + returnDenominator;
    }
  }

  public int gcd(int first, int second) { 
    int result=0;
    if (second==0) {
        return first;
    }
    result= gcd(second,first%second);
    return result;
  }

  public int[] abbreviation(int molecule, int denominator){ 
    int result= gcd(molecule, denominator);
    int[] abbreviationResult = new int[2];
    abbreviationResult[0]=molecule= molecule/result;
    abbreviationResult[1] =denominator= denominator/result;
    return abbreviationResult;
  }

  @Override
  public MyNumber plus(MyNumber operand) {
    MyNumber molecule = null;
    MyNumber denominator = null;
    int gcdResult = gcd(this.denominator, ((RationalNumber) operand).getDenominator());
    int[] expression = new int[4];
    int[] result = new int[2];
    expression[0] = this.molecule;
    expression[1] = this.denominator;
    expression[2] = ((RationalNumber) operand).getMolecule();
    expression[3] = ((RationalNumber) operand).getDenominator();

    if(gcdResult == 1){
      result[0]= (expression[0]*expression[3])+(expression[1]*expression[2]); 
      result[1]= expression[1]*expression[3];
    }else{
      int lcm = ((expression[1])*expression[3]/gcdResult);
      int firstNum = (lcm/expression[1]);
      int secondNum = (lcm/expression[3]);
      for(int i =0;i<expression.length;i++){
        if(i<2){
          expression[i]=expression[i]*firstNum;
        }else{
          expression[i]=expression[i]*secondNum;
        }
      }
      result[0]=expression[0]+expression[2];
      if(expression[1]==expression[3]){
        result[1] = expression[1];
      }
    }
    return operand; //마이넘버 타입으로 값을 변환해줄 방법을 찾지 못했습니다 죄송합니다.. 
  }

  @Override
  public MyNumber minus(MyNumber operand) {
    int gcdResult = gcd(this.denominator, ((RationalNumber) operand).getDenominator());
    int[] expression = new int[4];
    int[] result = new int[2];
    expression[0] = this.molecule;
    expression[1] = this.denominator;
    expression[2] = ((RationalNumber) operand).getMolecule();
    expression[3] = ((RationalNumber) operand).getDenominator();

    if(gcdResult == 1){
      result[0]= (expression[0]*expression[3])+(expression[1]*expression[2]); 
      result[1]= expression[1]*expression[3];
    }else{
      int lcm = ((expression[1])*expression[3]/gcdResult);
      int firstNum = (lcm/expression[1]);
      int secondNum = (lcm/expression[3]);
      for(int i =0;i<expression.length;i++){
        if(i<2){
          expression[i]=expression[i]*firstNum;
        }else{
          expression[i]=expression[i]*secondNum;
        }
      }
      result[0]=expression[0]-expression[2];
      if(expression[1]==expression[3]){
        result[1] = expression[1];
      }
    }
    return operand;
  }

  @Override
  public MyNumber multipliedBy(MyNumber operand) {
    int[] expression = new int[4];
    int[] result = new int[2];
    expression[0] = this.molecule;
    expression[1] = this.denominator;
    expression[2] = ((RationalNumber) operand).getMolecule();
    expression[3] = ((RationalNumber) operand).getDenominator();

    result[0] = expression[0] * expression[2];
    result[1] = expression[1] * expression[3];
    int[] abbreviationResult = abbreviation(result[0], result[1]);

    return operand;
  }

  @Override
  public MyNumber dividedBy(MyNumber operand) {
    int[] expression = new int[4];
    int[] result = new int[2];
    expression[0] = this.molecule;
    expression[1] = this.denominator;
    expression[2] = ((RationalNumber) operand).getMolecule();
    expression[3] = ((RationalNumber) operand).getDenominator();

    int temp= expression[2];
    expression[2]=expression[3];
    expression[3]=temp;
    result[0]=expression[0]*expression[2];
    result[1]=expression[1]*expression[3];
    int[] abbreviationResult = abbreviation(result[0], result[1]);

    return operand;
  }
  
  public int compareTo(RationalNumber number) {
    if(this.denominator == number.denominator){
      return 0;
    }
    else if(this.denominator < number.denominator){
        return -1;
    }
    else{
        return 1;
    }
}
  
}
