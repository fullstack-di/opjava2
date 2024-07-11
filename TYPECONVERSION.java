import java.io.*;
class TYPECONVERSION
{
public static void main(String args[])
{
 float a=3.4f;
 double b=a; // implict to give small to high ---float to dobule
 System.out.println(b);
  double c=1.234567845688932456;
  float d;
   d=(float)c;//explict to give high to low--dobule to float
   System.out.println(d);
}
}