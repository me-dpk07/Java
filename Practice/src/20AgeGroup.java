import java.util.Scanner;
class AgeGroup {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = input.nextInt();
        if (age > 60){
            System.out.println("You are a Senior");
        }else if (age < 60 && age > 20){
            System.out.println("Your are an Adult");
        } else if (age < 20 && age >13) {
            System.out.println("You are a Teenager");
        }else{
            System.out.println("You are a child");
        }
    }
}
