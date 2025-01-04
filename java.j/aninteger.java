import java.util.Scanner;

class aninteger{
    public static void main(String args[])
    {
    Scanner scan =new Scanner(System.in);
    int n = scan.nextInt();
    for( int i=0;i<=10;i=i+1)
    {
      System.out.println(i+"x"+n+"="+i*n);
    }
}
}