package javaAssignement3.Polymorphism;

public class OverridingPolymor {
    public static void main(String[] args) {
        Vehicle vl = new Vehicle();
        vl.start();

        Car cr = new Car();
        cr.start();

        Bike bk = new Bike();
        bk.start();
    }
}
