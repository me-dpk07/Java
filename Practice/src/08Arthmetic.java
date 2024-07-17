import java.util.Scanner;
public class Arthmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        int firstNumber = input.nextInt();
        System.out.println("enter your second number");
        int secondNumber = input.nextInt();
        System.out.println("addition of both numbers are " + (firstNumber+secondNumber));
        System.out.println("subtraction of both numbers are " + (firstNumber-secondNumber));
        System.out.println("division of both numbers are " + (firstNumber/secondNumber));
        System.out.println("multiplication of both numbers are " + (firstNumber*secondNumber));
        System.out.println("remainder of both numbers are " + (firstNumber%secondNumber));

    }
}