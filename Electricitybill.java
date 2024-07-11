import java.util.*;
class Electricitybill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float eb,current,previous,tb;
System.out.println("enter the values");
current=sc.nextFloat();
previous=sc.nextFloat();
tb=current-previous;
if(tb>0 && tb<=100)
eb=(tb)*0.8f;
else if(tb>100 && tb<=200)
eb=80+(tb-100)*1.2f;
else if(tb>200 && tb<=300)
eb=200+(tb-200)*1.5f;
else
eb=350+(tb-300)*1.8f;

 System.out.println("electric bill:"+eb);
}
}

