import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = input.nextLine();
        System.out.println("gud morning "+name+"!! " );
        System.out.println(name +"also tell me your age");
        int age = input.nextInt() ;
        System.out.println("hey "+ name + " your age is "+ age);

    }
}
