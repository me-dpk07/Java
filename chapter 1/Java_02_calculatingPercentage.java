import java.util.Scanner;

public class Java_02_calculatingPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your English marks");
        int a = sc.nextInt();
        System.out.println("Enter your Maths marks");
        int b = sc.nextInt();
        System.out.println("Enter your Physics marks");
        int c = sc.nextInt();
        System.out.println("Enter your chemistry marks");
        int d = sc.nextInt();
        System.out.println("Enter your Hindi marks");
        int e = sc.nextInt();
        int sum = a + b +c + d + e;
        int percent =  sum/5;
        System.out.println("Your percentage is");
        System.out.println(percent);
    }
}