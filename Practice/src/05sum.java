import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = input.nextInt();
        System.out.println("Enter your second Number");
        int b = input.nextInt();
        int sum = a+ b;
        System.out.println("The sum of both numbers is sum "+ sum);
    }
}
