package AssignmentJava2;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 7;

        //Switch Statement
        switch (number) {
            case 1:
                System.out.println("Small");
                break;
                case 2:
                    System.out.println("Medium");
                    break;
                    case 3:
                        System.out.println("Large");
                        break;
            default:
                System.out.println("unknown");

        }
    }
}
