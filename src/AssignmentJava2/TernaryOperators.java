package AssignmentJava2;
public class TernaryOperators {
    public static void main(String[] args) {
        //Ternary operator and : ?: (int min =(a<b)? a:b)
        //variable = condition ? expressionTrue : expressionFalse;
        int number1 = 10;
        int number2 = 20;

        int maxNumber = number1 > number2 ? number1 : number2;
        System.out.println(maxNumber);


        maxNumber = ((number1 > number2) || (number1 < number2)) ? number1 : number2;
        System.out.println(maxNumber);

    }
}