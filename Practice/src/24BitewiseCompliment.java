import java.sql.SQLOutput;
import java.util.Scanner;
class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int Number = input.nextInt();
        int compliment = ~ Number;
        System.out.println(compliment);
    }
}
