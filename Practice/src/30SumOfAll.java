import java.util.Scanner;
class SumOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = allSum(num);
        System.out.println("Sum of the numbers is " + sum );


    }
    public static int allSum(int num){
        int sum = 0;
        while (num>0){
            sum+= num % 10;
            num = num/10;

        }
        return sum;

    }
}
