import java.util.Scanner;

class anotherarray{
    public static void main(String args[])
    {
        int[] mark = new int[5];
      Scanner scan = new Scanner(System.in);
       mark[0] =scan.nextInt();
       mark[1] =scan.nextInt();
       mark[2] =scan.nextInt();
       mark[3] =scan.nextInt();
       mark[4] =scan.nextInt();
      System.out.print(mark[0]+mark[1]+mark[2]+mark[3]+mark[4]);
       
    }
}