java code to input student id , student name,student attendence.
import java.util.Scanner;
class Stud
 {
   public static void main(String[] args)
    {
      int std_id; //student id
      String std_name, std_attend; // student name and student attendence 
      System.out.println("Enter the Student Name : ");
      Scanner sc=new Scanner(System.in); 
      std_name=sc.next();	// Taking value 
      System.out.println("Enter Student ID : ");
      std_id=sc.nextInt();	// Taking value
      System.out.println("Enter Student Attendence'P'or'A':- ");
      std_attend=sc.next();	// Take value
      System.out.println("Student Name : "+std_name);	// Print name
      System.out.println("Student ID : "+std_id);	// Print id 
      System.out.println("Student Attendence : "+std_attend);	// Print attendence
    }
}