import java.lang.System;
import java.util.Scanner;

class ifelse{
public static void main(String args[])
{
       {
        System.out.print("is meghana is dead or alive");
       }
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        if(a.equals("dead"))
        {
          System.out.print("surya meets ramya");   
        }
        else{
            System.out.print("surya weds meghana");
        }
    }
}