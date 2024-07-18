import java.util.Scanner;
class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("the number is positive");
        }else if(number < 0){
            System.out.println("the number is negative");
        }else {
            System.out.println("the number is zero");
        }

    }
}
