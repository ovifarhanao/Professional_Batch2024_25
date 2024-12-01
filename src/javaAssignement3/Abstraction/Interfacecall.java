package javaAssignement3.Abstraction;

public class Interfacecall {
    public static void main(String[] args) {
        Printable doc=new Document();
        Printable image =new Image();

        doc.print();
        image.print();
    }
}
