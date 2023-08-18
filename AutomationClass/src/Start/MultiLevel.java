package Start;

public class MultiLevel extends Webautomation
{
public void method3()
{
System.out.println("I am son");	
}
public static void main(String[] args) {
	MultiLevel a=new MultiLevel();
	a.method1();
	a.method2();
	a.method3();
	a.abc=2023;
	System.out.println(a.abc);
	a.bb=222;
	System.out.println(a.bb);
}
}
