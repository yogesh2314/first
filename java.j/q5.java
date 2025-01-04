import java.util.Scanner;

class q5{
    public static void main(String args[])
    { 
        System.out.print("enter for check ODD or Even number = ");
               // if a num odd print odd 
               // else even 
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();  //% for the remainder process
        if(num1%2==0)
        {
            System.out.print("it is even number");
        }
        
        else{
            System.out.print("it is odd number");
        }
    }
}