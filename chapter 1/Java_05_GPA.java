import java.util.Scanner;
public class Java_05_GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1");
        float a = sc.nextInt();
        System.out.println("enter marks of subject 2");
        float b = sc.nextInt();
        System.out.println("enter marks of subject 3");
        float c = sc.nextInt();
        float sum = a+b+c;
        float gpa = sum/30;
        System.out.println("your total marks is " + sum );
        System.out.println(" The GPA on the basis of marks is " + gpa);

    }
}