import java.util.Scanner;

class score2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        double b = scan.nextDouble(); //ithu vanthu answer point la varaku podrathu
        scan.nextLine();
        String c =scan.nextLine();
        System.out.println("my name  is "+a);
        System.out.println("my score is "+b/10);
        System.out.print("my department is "+c);
    }
}
