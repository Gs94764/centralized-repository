package Start;

public class Student 
{
public void method1()
{
  System.out.println("i am first line of method");
  System.out.println("i am secound line of the methiod");
}
public void method12()
{
  System.out.println("i am first line of method");
  System.out.println("i am secound line of the methiod");
}
public static void main(String[] args) 
{
	Student gaurav=new Student();
	int abc=123;
    System.out.println("i am main method");
    System.out.println(abc);
	System.out.println("i am secound method");
	gaurav.method1();
	System.out.println("i'm method one");
	gaurav.method12();
	System.out.println("i am final line of code");
	
}
}
