//Program to find the largest of 03 numbers?
import java.util.Scanner;
class Ifelse
{
 public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        x = s.nextInt();
        System.out.print("Enter the value of y:");
        y = s.nextInt();
        System.out.print("Enter the value of z:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
	    {
            System.out.println("Largest number is:"+z);
        }
 
    }
}