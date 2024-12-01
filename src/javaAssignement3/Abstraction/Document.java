package javaAssignement3.Abstraction;

public class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Document");
    }
}
