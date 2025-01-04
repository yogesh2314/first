class q12{
    public static void main(String args[])
    {
        System.out.print("printing the no of odd numbers from 1 to 10 = ");
        int a =0;
        for( int j=1;j<=10;j=j+1)
        { 
         if(j%2==1){
             a = a+1;
         }
        }
        System.out.print(a);
    }
}