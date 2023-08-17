package Start;

public class Studentthis1 {

	public void abc()
	{
		System.out.println("i am method");
	}

	public Studentthis1() 
	{
		System.out.println("default");
	}
	public Studentthis1(int a)
	{
		this();
		System.out.println("one perametrized");

	}
	public Studentthis1(int a, int b)
	{
		System.out.println("two perametrized");
	}
	public Studentthis1(int a, int b, int c)
	{
		
		System.out.println("three perametrized");
	}
	public Studentthis1(int a, int b, int c, int d)
	{
		
		System.out.println("four perametrized");
	}
	public static void main(String[] args) {
		Studentthis1 ob=new Studentthis1(2);
		Studentthis1 ob2=new Studentthis1(2,3,3,4);
		
		
	
	}
}
