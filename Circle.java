//write a java program which reads radius as input and find the area and circumference of a circle
import java.util.*;
class Circle
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 float area,radius,circumference;
 System.out.println("enter the radius");
 radius=sc.nextFloat();
 area=3.142f*radius*radius;
 circumference=2*3.142f*radius;
 System.out.println("enter the area:"+area);
 System.out.println("enter the circumference:"+ circumference);
 }
}
