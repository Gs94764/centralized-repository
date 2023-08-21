package Masti;

public class DC 
{
public void m1(int a)
{
	this.m2();
	this.m3();
System.out.println("i am first method");	
}
public void m2()
{
System.out.println("i ma secound method");	
}
public void m3()
{
System.out.println("i am third method");	
}
public static void main(String[] args) {
	DC abc=new DC();
	abc.m1(12);
}
}
