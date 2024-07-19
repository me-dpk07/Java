import java.util.Scanner;
public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int num = input.nextInt();
        int sum = allOdd(num);
        System.out.println("the sum till "+ num + " is :  " + sum);
    }
    public static int allOdd(int num){
        int sum = 0 ;
        int i = 1 ;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }

}
