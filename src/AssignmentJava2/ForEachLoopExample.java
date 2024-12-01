package AssignmentJava2;

public class ForEachLoopExample {
    //for each loop
    public static void main(String[] args) {
        int code[] = {3, 5, 7, 9};
        String[] names = {"Ovi", "Biva", "Raida"};
        Double[] marks = {100.00, 87.50, 25.45};


//for each loop (data Type: same data array and list)
        for (int a : code) {
            System.out.println(a);
        }
        for (String b : names) {
            System.out.println(b);
        }
        for (Double c : marks) {
            System.out.println(c);
        }
    }
}

