import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
       // rain or bike =good
        //else=bad
        boolean rain = true;
        boolean bike = true;

        if(rain || bike)
        {
            System.out.print("good ");
        }
        else{
            System.out.print("bad");
        }
    }
}