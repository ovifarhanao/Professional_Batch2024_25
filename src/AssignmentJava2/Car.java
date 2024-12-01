package AssignmentJava2;

public class Car {
    //Variable
    private String brandName ="Toyota";

        //Method to display Color
        public void displaybrandName() {
        System.out.println ("The brand of car :" + brandName);
        }

//Main Method
    public static void main(String[]args){
            /* Creating object */
            Car myCar = new Car();
            System.out.println(myCar.brandName);
//Calling method
            myCar.displaybrandName();
        }
    }
