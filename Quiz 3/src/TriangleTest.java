import java.util.Scanner;

public class TriangleTest  {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("The Triangle Sides are \n side 1: "+ triangle.getSide1() + "\n Side 2: " + triangle.getSide2() + "\n Side 3: " + triangle.getSide3());
        System.out.println("The Triangle's Area is " + triangle.getArea());
        System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());

        input.close();
    }
}