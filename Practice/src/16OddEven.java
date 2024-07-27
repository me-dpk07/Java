import java.util.Scanner;
class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }
    }
}
