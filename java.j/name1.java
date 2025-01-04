import java.lang.System;
import java.util.Scanner;

class name1
{
    public static void main(String args[])
    {
        Scanner cc = new Scanner(System.in);
        String n = cc.nextLine();
        int a = cc.nextInt();
        cc.nextLine();
        String ad = cc.nextLine();
        System.out.println("my name is "+n);
        System.out.println("my age is "+a);
        System.out.println("my address is "+ad);
    }
}