public class arraySumof5floats {

    public static void main(String[] args) {
        float [] marks = {45.4f,65.5f,65.4f,85.5f,90.5f};
        float sum = 0;
        for (float elements:marks) {
            sum =sum + elements;
  
        }
        System.out.println("The sum of the numbers are"+" "+ sum);
    }
}