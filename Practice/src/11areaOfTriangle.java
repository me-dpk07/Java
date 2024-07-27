import java.util.Scanner;
class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base of triangle");
        double base = input.nextDouble();
        System.out.println("Enter height of triangle");
        double height = input.nextDouble();
        System.out.println("Area of triangle is " + (0.5*base*height));

    }
}
