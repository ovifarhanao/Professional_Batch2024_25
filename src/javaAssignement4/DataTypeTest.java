package javaAssignement4;

import javaAssignement4.generic.Generic;
import javaAssignement4.generic.GenericWithWildCard;
import javaAssignement4.nonGeneric.DoubleTest;
import javaAssignement4.nonGeneric.IntegerTest;
import javaAssignement4.nonGeneric.LongTest;
import javaAssignement4.nonGeneric.StringTest;

public class DataTypeTest {
//Non Generic
    public static void main(String[] args) {
        StringTest test= new StringTest("Nova");
        System.out.println(test.getString());

        IntegerTest test1= new IntegerTest(100);
        System.out.println(test1.getInteger());

        DoubleTest test2= new DoubleTest(1234.23);
        System.out.println(test2.getaDouble());

        LongTest test3= new LongTest(1234L);
        System.out.println(test3.getLong());


        System.out.println("=================================");

//Generic without restrictions

    Generic<String> generic1 = new Generic<>("Nova");
          System.out.println(generic1.getContent());

          Generic<Integer> generic2 = new Generic<>(100);
          System.out.println(generic2.getContent());
          Generic<Double> generic3 = new Generic<>(1234.23);
           System.out.println(generic3.getContent());
    Generic<Long> generic4 = new Generic<>(1234L);
           System.out.println(generic4.getContent());

        //List<String> strings= Arrays.asList("Ovi", "Nova", "Ava");
        // List<Integer> strings1= Arrays.asList(1,2,3);

        //Generic with restrictions

GenericWithWildCard<Integer> generic5= new GenericWithWildCard<>(1000);
        System.out.println(generic5.getContent());

}
}
