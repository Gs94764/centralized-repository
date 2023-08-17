package Start;

public class First 
{
	public int sum(int a,int b)
	{
	int c;
	c=a+b;
	System.out.println("Result is " +c);
	return c;
	}
	public int sub(int a1,int a2)
	{
	int c1;
	c1=a1-a2;
	System.out.print("Result is " +c1);
	return c1;
	}
	public int multi(int d1,int d2)
	{
	int e1;
	e1=d1*d2;
	System.out.println("Resultis "+e1);
	return e1;
	}
	public int div(int l1,int l2)
	{
	int l3;
	l3=l1/l2;
	System.out.print("Result is "+l3);
	return l3;
	}
	public void multi(int x,int y, int z, int l3)
	{
	int n;
	n=x+y-z*l3;
	System.out.print("Final result " +n);
	}
	public static void main(String[] args) 
	{
		First obj=new First();
		int sumresult=obj.sum(20,22);
		int subresult=obj.sum(20,23);
		int multiresult=obj.multi(20, 5);
		int divresult=obj.div(100,7);
		obj.multi(sumresult, subresult, multiresult,divresult); 
	}
	}
