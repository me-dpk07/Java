import java.util.Scanner;
class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your final Percentage ");
        float percentage = input.nextFloat();
        if(percentage>90){
            System.out.println("Grade A");
        } else if (percentage > 60 && percentage < 90) {
            System.out.println("Grade B");
        }else if (percentage > 30 && percentage < 60){
            System.out.println("Grade C");
        }else {
            System.out.println("Grade D");
        }
    }
}
