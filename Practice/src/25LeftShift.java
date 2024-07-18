import java.sql.SQLOutput;
import java.util.Scanner;
class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int Number = input.nextInt();
        int Leftshift = Number << 4;
        System.out.println(Leftshift);
    }
}
