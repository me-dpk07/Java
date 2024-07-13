import java.util.Scanner;
public class daysOfweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 7;
        System.out.println("enter your number");
        days = sc.nextInt();
        switch (days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        
           
        }

    }
