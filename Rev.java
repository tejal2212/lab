// Program to print reverse a number?
import java.util.Scanner;
class Rev 
{
  public static void main(String[] args)
  {

    int num, reversed = 0;
	System.out.println("Enter the number : ");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
    System.out.println("Original Number: " + num);
    while(num != 0)
		{
      int digit = num % 10; // get last digit from num
      reversed = reversed * 10 + digit;
      num /= 10;// remove the last digit from num
    }
    System.out.println("Reversed Number: " + reversed);
  }
}