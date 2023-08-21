package Masti;

public class DC1 
{
	int a=78;
	public void method1(int abc)
	{
		a=abc;
	}
	public static void main(String[] args) {
		DC1 obc1=new DC1();
		obc1.method1(2222);
		System.out.println(obc1.a);
		
	}
}



