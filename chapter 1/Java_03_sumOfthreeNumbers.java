import java.util.Scanner;
public class Java_03_sumOfthreeNumbers{
    public static void main(String[] args) {
        System.out.println("input the Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        System.out.println("Enter the number 3");
        int c = sc.nextInt();
        float sum = a+b+c;
        System.out.println("sum of all three numbers are");
        System.out.println(sum);
    }
} 