import java.util.Scanner;
class Factorial {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        long factorial = factorial(num);
        System.out.println("the factorial of the number is : " + factorial  );
    }
    public static long factorial(int num ){
        if (num < 2 ){
            return 1;
        }
        long factorial = 1;
        int i = 2;
        while (i <= num ){
            factorial *= i;
            i++;
        }
        return factorial;
    }
    }
