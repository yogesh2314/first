import java.util.Random;

class whileloop
{
  public static void main(String args[])

 {
    Random rand = new Random();
    int i=0;
    while(i!=7){
        i = rand.nextInt(17);
        System.out.print(i);
        System.out.println();
    }
 }
}