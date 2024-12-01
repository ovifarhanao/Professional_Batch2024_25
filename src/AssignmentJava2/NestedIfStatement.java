package AssignmentJava2;

public class NestedIfStatement {
    public static void main(String[] args) {
        int number1 = 7, number2 = 8, number3 = 10;

        if (number1 >= number2) {
            if (number1 >= number3)
                System.out.println(number1 + " is the largest.");
            else
                System.out.println(number3 + " is the largest.");
        } else {
            if (number2 >= number3)
                System.out.println(number2 + " is the largest.");
            else
                System.out.println(number3 + " is the largest.");
        }
    }
}
