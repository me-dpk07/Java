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
        int Total = a + b +c + d + e;
        float percent =  Total*100 /500;
        System.out.println("Your percentage is");
        System.out.println(percent);
        float gpa = (percent*100)/4;
        System.out.println("your gpa is");
        System.out.println(gpa);
    }
}