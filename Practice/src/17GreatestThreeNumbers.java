import java.util.Scanner;
class GreatestThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numbers");
        float number1 = input.nextFloat();
        System.out.println("Enter the second numbers");
        float number2 = input.nextFloat();
        System.out.println("Enter the third numbers");
        float number3 = input.nextFloat();

        if (number1 > number2 && number1 > number3){
            System.out.println("Number " + number1 + " is greater");
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println("Number " + number2 + " is greater");
        }
        else {
            System.out.println("Number " + number3 + " is greater");
        }
    }
}
