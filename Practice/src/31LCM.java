import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number 1st");
        int num1 = input.nextInt();
        System.out.println("Enter your number 2nd");
        int num2 = input.nextInt();
        int AlllCM = LCM(num1,num2);
        System.out.println("LCM of the both numbers are "+ AlllCM);

    }
    public static int LCM(int num1, int num2){
        int i = 1 ;
        while (i <= num2){
            int factorOfBoth = num1 * i ;
            if (factorOfBoth % num2 == 0){
                return factorOfBoth;
            }
        i++;
        }
    return 0;
    }
}
