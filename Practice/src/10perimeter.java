import java.util.Scanner;
class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("value of A is :");
        float valofA = input.nextFloat();
        System.out.println("value of B is :");
        float valofB = input.nextFloat();
        System.out.println("value of C is :");
        float valofC = input.nextFloat();
        System.out.println("value of D is :");
        float valofD = input.nextFloat();
        double perimeter = valofA+valofB+valofC+valofD;
        System.out.println("Perimeter of rectangle ABCD is: " + perimeter);
    }
}
