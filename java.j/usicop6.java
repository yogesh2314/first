import java.lang.System;
import java.util.Scanner;

class usicop6{
    public static void main(String args[])
    { 
      {
        System.out.print("enter the two numbers for checking the conditions for the equality of the given numbers");
      }
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      if(a==b)
      {
        System.out.print("kuduthathu equal dra mappla");
      }
       else
       {
        System.out.print("maams ehh not equal dra");
      }
    }
}