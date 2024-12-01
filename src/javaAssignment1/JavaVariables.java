package javaAssignment1;

public class JavaVariables {

    static int a = 10;//static variable
     int b = 20; //instance Variable


    void JavaVariables()
    {
        int n=90;//local variable
        System.out.println(n);
    }

   public void display () {
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        JavaVariables Obj1= new JavaVariables();
        Obj1.JavaVariables ();
        Obj1.display ();

    }


}
