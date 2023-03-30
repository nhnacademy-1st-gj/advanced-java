import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sql.rowset.spi.SyncResolver;

public class Exam {
  
  public static void main(String[] args){

    //1
    RationalNumber newRn = new RationalNumber(100);
    System.out.println(newRn);

    RationalNumber newRn2 = new RationalNumber(2,3);
    System.out.println(newRn2);

    RationalNumber newRn3 = new RationalNumber(newRn2);
    System.out.println(newRn3);

    RationalNumber newRn4 = new RationalNumber(100,4);
    System.out.println(newRn4);

    RationalNumber newRn5 = new RationalNumber(8,6);
    System.out.println(newRn5);

    System.out.println("--");

    //3.1
    List<RationalNumber> sortTest = new ArrayList<>();
    sortTest.add(newRn);
    sortTest.add(newRn2);
    sortTest.add(newRn3);
    sortTest.add(newRn4);
    sortTest.add(newRn5);

    List<RationalNumber> sortedTest = sortTest.stream().sorted().collect(Collectors.toList());

    for(RationalNumber a: sortedTest){
      System.out.println(a);
    }
    System.out.println("--");

    //4
    Calculator calculator = new Calculator();

    String infix ="3 * 2 + ( 4 / 5 * 2 )";
    String operandPattern="infix";
    System.out.println(calculator.parsing(infix, operandPattern));
    infix ="3 * 2 + ( 4 / 5 * -2 )";
    operandPattern="prefix";
    String afterPrefix = calculator.infixToPostfix(infix, operandPattern);
    System.out.println(afterPrefix);
  }
}
