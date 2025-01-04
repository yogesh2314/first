import java.util.Scanner;

class q8{
     public static void main(String args[])
     {
        System.out.print("enter the salary and age and loan required amount");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>=20000 || b<=25)
        {
            System.out.print("enter the loan required ");
            int c = scan.nextInt();
            if(c<=50000)
            {
                System.out.print("you are eligible for the loan");
            }
            if(c>50000)
            {
                System.out.print("max amount is 50000");
            }
        }
        else{
            System.out.print("you are not eligible");
        }
     }
}