import java.util.*;
class Section
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter the value a:");
a=sc.nextInt();
if(a>=0 && a<=60)
{
if(a==34)
System.out.println("anu");
else{
if(a>=60 && a<=100)
System.out.println("rev");
}
}
}
}


