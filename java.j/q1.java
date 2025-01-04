import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        System.out.print("enter your mark for results");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>=35){
            System.out.print("congrats you've passed");
        }
        else{
            System.out.print("You've an another step for being passed");
        }
    }
}