import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principle amount in rupees");
        double principle = input.nextDouble();
        System.out.println("Enter time period in years");
        double time = input.nextDouble();
        System.out.println("Enter interest rate in %");
        double rate = input.nextDouble();
        double interest = (principle*rate*time)/100;
        System.out.println("Your Simple interest will be " + interest);
        System.out.println("Your total money will be : " + (interest+principle));
    }
}
