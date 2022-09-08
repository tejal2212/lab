//java code for operators
class Main
 {
  public static void main(String[] args)
  {    
    int a = 12, b = 5, a1, b1;
	System.out.println("arithmetic operator");
    System.out.println("a+b = " +(a + b));//add
    System.out.println("a-b = " +(a - b));//sub
    System.out.println("a*b = " +(a * b));//multiply
    System.out.println("a/b = " +(a / b));//div
    System.out.println("a%b = " +(a % b));//mod
	System.out.println("relational operator");
    System.out.println("a is " + a + " and b is " + b);
    System.out.println(a == b);  // equal to
    System.out.println(a != b);  // not equal to
    System.out.println(a > b);  // greater than
    System.out.println(a < b);  //less than
    System.out.println(a >= b);  // greater than equal to
    System.out.println(a <= b);  // less than equal to
	System.out.println("increment and decrement");
    a1 = ++a;
    System.out.println("After increment: " + a1);//increment
    b1 = --b;
    System.out.println("After decrement: " + b1);//decrement
  }
}

