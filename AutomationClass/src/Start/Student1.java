package Start;

//no return type 
//costructor name and class name will be same 
//no return type 
//no need to call,it will be called by itself as we  create the object  the class 
public class Student1 {
	public void abc()
	{
		System.out.println("i am method");
	}

	public Student1() 
	{
		System.out.println("default");
	}
	public Student1(int a)
	{
		System.out.println("one perametrized");

	}
	public Student1(int a, int b)
	{
		System.out.println("two perametrized");
	}
	public Student1(int a, int b, int c)
	{
		System.out.println("three perametrized");
	}
	public Student1(int a, int b, int c, int d)
	{
		System.out.println("four perametrized");
	}
	public static void main(String[] args) {
		Student1 ob=new Student1(2);
		// gaurav.abc(); // we need to call it 
		Student1 ob1=new Student1(2,3);
		Student1 ob2=new Student1(2,3,4,4);
		Student1 ob3=new Student1();
		Student1 ob4=new Student1(2,2,2);
		
	
	}
}
