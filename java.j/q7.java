import java.util.Scanner;
class q7{
    public static void main(String args[])
    {
        System.out.print("enter the five subjects marks line by line for avg =");
        Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int b = scan.nextInt();
         int c = scan.nextInt();
         int d = scan.nextInt();
         int e = scan.nextInt();
         int f = a+b+c+d+e;
         int g = 5;
         if(f/g>=35){
            System.out.print("you have to go");
         }
         else{
            System.out.print("you need the special classes");
         }

    }
}