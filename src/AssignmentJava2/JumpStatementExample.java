package AssignmentJava2;

public class JumpStatementExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);

        }
        System.out.println("----------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) break;
        }

        System.out.println("----------------");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) continue;
            System.out.println(j);
        }

        System.out.println("----------------");
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
            if (j == 5) ;
        }
    }
}
