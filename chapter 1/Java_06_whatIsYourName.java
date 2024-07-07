import java.util.Scanner;
public class Java_06_whatIsYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name");
        String name = sc.next();
        System.out.println("Hii "+ name+","+  " How are you?");
    }
