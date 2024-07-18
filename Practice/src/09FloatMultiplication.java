import java.util.Scanner;
class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number ");
        double firstNumber = input.nextDouble();
        System.out.println("Enter your second number ");
        double secondNumber = input.nextDouble();
        double multiply = firstNumber*secondNumber;
        System.out.println(multiply);
    }
}
