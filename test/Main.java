package test;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "white");
        System.out.println(circle1.toString());
        Cylinder cylinder1 = new Cylinder(3, "red", 10);
        System.out.println(((Circle) cylinder1).toString());
    }
}