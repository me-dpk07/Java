import java.sql.SQLOutput;
import java.util.Scanner;
class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int Number1 = input.nextInt();
        System.out.println("Enter your second number");
        int Number2 = input.nextInt();
        int And = Number1 & Number2;
        System.out.println(And);
    }
}