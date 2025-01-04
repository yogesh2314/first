import java.util.Scanner;

class q4{
    public static void main(String args[])
    { 
        System.out.print("enter for check it is div by 3 and 5 = ");
               // if a num div by 3 and 5 check
               // true = div, false = not div
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();  //% for the remainder process
        if(num1%3==0 && num1%5==0)
        {
            System.out.print("its a divisible number of 3 and 5 ");
        }
        else{
            System.out.print("not a valid number");
        }
    }
}