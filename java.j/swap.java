class swap{

public static void main(String args[])
{int a = 10;
 int b =5;
System.out.println("before swapping:a="+a);
System.out.println("b="+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping:a="+a);
System.out.println("b="+b);
}
}