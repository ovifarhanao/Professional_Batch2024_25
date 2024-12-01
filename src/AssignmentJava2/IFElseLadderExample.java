package AssignmentJava2;

public class IFElseLadderExample {
    public static void main(String[] args) {

        int score=90;
        //if else ladder
        if (score > 90 || score <= 100) {
            System.out.println("Your Grade is : A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your Grade is : B");
        } else if (score >= 60 && score < 80)  {
            System.out.println("Your Grade is : C");
        } else if (score >= 50 && score < 60) {
            System.out.println("Your Grade is : D");
        } else if (score >= 40) {
            System.out.println("Your Grade is : F");
        }
    }
}
