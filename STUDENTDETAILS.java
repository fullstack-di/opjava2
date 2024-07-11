//write a java program which reads the details of student rollno,
//name,branch,semister and marks for the keyboard and display the same on the scereen
import java.util.*;
class STUDENTDETAILS
{
 public static void main(String args[])
 {
//creation of scanner object
   Scanner sc=new Scanner(System.in);
   int rollno,semseter;
   String name,branch;
   float marks;
   char gender;
   System.out.println("enter the student details");
  System.out.println("enter the student name");
   name=sc.nextLine();
   System.out.println("enter the student branch");
   branch=sc.nextLine();
   System.out.println("enter the student gender");
   gender=sc.next().charAt(0);
   System.out.println("enter the student roll no");
   rollno=sc.nextInt();

   System.out.println("enter the student semster");
   semseter=sc.nextInt();
   System.out.println("enter the student marks");
   marks=sc.nextFloat();

   System.out.println("enter the student details:");
   System.out.println("enter the rollno:"+rollno);
   System.out.println("enter the  name:"+name);
   System.out.println("enter the  semster:"+semseter);
   System.out.println("enter the branch:"+branch);
   System.out.println("enter the marks:"+marks);
    System.out.println("enter the gender:"+gender);

}
}





