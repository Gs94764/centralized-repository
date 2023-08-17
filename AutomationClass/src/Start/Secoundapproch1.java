package Start;

public class Secoundapproch1 {
	 
int a,b,c,d,e;
public void method1(int a1,int a2,int a3, int a4, int a5)
{
	 a=a1;
	 b=a2;
	 c=a3;
	 d=a4;
	 e=a5;
}
public static void main(String[] args) 
{
	Secoundapproch1 ob=new Secoundapproch1();
	ob.method1(11,22,33,34,35); // 1 st call 
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.c);
	System.out.println(ob.d);
	System.out.println(ob.e);
	
	Secoundapproch1 ob1=new Secoundapproch1();
	ob.method1(202,111,303,304,305); // 2 st call 
	System.out.println(ob1.a);
	System.out.println(ob1.b);
	System.out.println(ob1.c);
	System.out.println(ob1.d);
	System.out.println(ob1.e);
}

}
