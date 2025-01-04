import java.util.Scanner;
class variable3{
    public static void main(String args[])
    {
        Scanner val = new Scanner (System.in);
        int a = val.nextInt();
        int b = val.nextInt();
        int c = val.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.print("the answer is"+d/e);
    }
}