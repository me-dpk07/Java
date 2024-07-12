import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class ifelse2 {
    public static void main(String[] args) {
      byte mark1, mark2,mark3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Physics marks");
      mark1 = sc.nextByte();
      System.out.println("Enter your Maths marks");
      mark2 = sc.nextByte();
      System.out.println("Enter your Chemistry marks");
      mark3 = sc.nextByte();

      float avg = mark1+mark2+mark3/3.0f;

      if(avg>=40 && mark1>= 33 && mark2>= 33 && mark3 >= 33){
         System.out.println("Congarttulation!! you are promoted to the next class");
   
      }
      else{
         System.out.println("Sorry!! you are not promoted because you are failed in subject and your total is not enough to get you into new clas");
      }

    }

   }
