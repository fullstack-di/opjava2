//write a java program which reads temp in fahrenheit convert to celsius
import java.util.*;
class Temp
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
float ct,ft;
 System.out.println("enter the fahernheat temp");
ft=sc.nextFloat();
ct=(ft-32.0f)*5/9;
 System.out.println("celsius temp:"+ct);
}
}