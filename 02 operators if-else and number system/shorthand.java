import java.util.Scanner;

public class shorthand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x1 = input.nextInt();
        a = a + x1; //or
        a += x1;
        System.out.println(a);

        System.out.println("enter second number");
        int x2 = input.nextInt();
        a = a + x2;
        System.out.println(a);

        System.out.println("enter third number");
        int x3 = input.nextInt();
        a = a + x3;
        System.out.println(a);

        System.out.println("enter forth number");
        int x4 = input.nextInt();
        a = a + x4;
        System.out.println(a);

    }
}