import java.util.Scanner;
class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit");
        float fahrenheit = input.nextFloat();
        double celcius = (fahrenheit-32)*5/9;
        System.out.println("temp in celcius will be " + celcius);
    }
}

