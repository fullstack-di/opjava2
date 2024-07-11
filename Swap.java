import java.util.*;
 class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,temp;
System.out.println("enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("before swap values:a="+a+"b="+b);
temp=a; //a=a+b
a=b;  //b=a-b
b=temp; //a=a-b
System.out.println("after swap values:a="+a+"b="+b);
}
}