import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number ");
        int a = input.nextInt();
        System.out.println("enter your second number ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("first number is " +a);
        System.out.println("second number is " +b);
    }

}
