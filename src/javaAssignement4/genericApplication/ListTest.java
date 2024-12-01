package javaAssignement4.genericApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add(0,"Ava");
        names.add(1,"Ovi");
        names.add("Maisha");
        names.remove(1);


        List<String> students = Arrays.asList("wahid","Hasaan");
        names.addAll(students);
        names.removeAll(students);

        for (String nn : names) {
            System.out.println(nn);
        }
    }
}
