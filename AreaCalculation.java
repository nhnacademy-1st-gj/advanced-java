interface IAreaCalculation{ //직사각형, 삼각형, 오각형을 위한 인터페이스
  double AreaCalculation(double height, double width); 
}
interface IAreaCalculationForSquare{ //정사각형을 위한 인터페이스
  double AreaCalculation(double side);
}


class Rectangle implements IAreaCalculation{ 
  private String type; //현재 어떤 도형의 넓이를 구하는지 구분해줄 String 변수 '타입' 선언
  public void setType(String type){
    this.type = type;
  }
  public String getType(){
    return type;
  }

  @Override
  public double AreaCalculation(double height, double width) {
    setType("직사각형");
    if(height==0 || width==0){
          throw new IllegalArgumentException("0을 넣을 수 없습니다.");
        }
    double result = height * width;
    System.out.println(getType() +"의 넓이는 "+ result + "㎠");
    return result;
  }
}

class Triangle extends Rectangle{
  @Override
  public double AreaCalculation(double height, double width) { //Rectangle 클래스를 상속받아 AreaCalculation를 오버라이딩
    setType("삼각형"); //타입을 "삼각형"으로 설정
    if(height==0 || width==0){
          throw new IllegalArgumentException("0을 넣을 수 없습니다.");
        }
    double result = (height * width)*0.5; 
    System.out.println(getType() +"의 넓이는 "+ result + "㎠");
    return result;
  }
}

class Pentagon extends Triangle{ //오각형의 넓이를 구할 때 삼각형의 넓이 공식을 이용할 것이므로 트라이앵글 클래스를 상속
  @Override
  public double AreaCalculation(double height, double width) { //메서드 오버로딩
    setType("오각형"); //타입을 "오각형"으로 설정
    if(height==0 || width==0){
          throw new IllegalArgumentException("0을 넣을 수 없습니다.");
        }
    double result = ((height * width)*0.5)*5; 
    System.out.println(getType() +"의 넓이는 "+ result + "㎠");
    return result;
  }
}

class Square implements IAreaCalculationForSquare{ //정사각형 인터페이스를 구현
  private String type;
  public void setType(String type){
    this.type = type;
  }
  public String getType(){
    return type;
  }
  @Override
  public double AreaCalculation(double side) {
    setType("정사각형");
    if(side==0 ){
      throw new IllegalArgumentException("0을 넣을 수 없습니다.");
    }
    double result = Math.round((side*side)* 100) / 100.0;
    System.out.println(getType() +"의 넓이는 "+ result + "㎠");
    return result;
  }
  
}

public class AreaCalculation {
  public static void main(String[] args){
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();
    Pentagon pentagon = new Pentagon();
    Square square = new Square();

    rectangle.AreaCalculation(5, 10);
    triangle.AreaCalculation(5, 10);
    pentagon.AreaCalculation(5, 10);
    square.AreaCalculation(5);

  }
  
}
