import java.util.Scanner;
public class Java_01_UserInput{
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        boolean a = sc.nextInt();
        System.out.println("Enter your second number");
        boolean b = sc.nextInt();
        boolean sum = a+b;
        System.out.println("sum of these numbers are ");
        System.out.println(sum);
    }
}