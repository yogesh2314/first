import java.util.Scanner;

class q6{
    public static void main(String args[])
    { 
        System.out.print("enter mark for your rewards= ");
               // if mark <35 = vg
               // if msrk <60 = iphone 
               // if mark <90 = bike
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();  //% for the remainder process
        if(num1>=35 && num1<60)
        {
            System.out.print("you won video games");
        }
        if(num1>=60 && num1<90){
            System.out.print("you won iphone ");
        }
        
        else if(num1>=90 && num1<100){
            System.out.print("you won a bike");
        }
        else if(num1>100){
            System.out.print("paramah exam eh 100 markuh thanda");
        }
        else if(num1<35){
            System.out.print("thambi iidu thingarakulla thapucikoh ");
        }
    }
}