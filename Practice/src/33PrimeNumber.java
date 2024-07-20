import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean isPrime = prime(num);
        if(isPrime){
            System.out.println("the number is prime");
        }else{
            System.out.println("the number is not prime");
        }
    }
    public static boolean prime(int num){
        int i = 2 ;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
