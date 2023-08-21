package Masti;

public class Swift extends Maruti
{ 
public void gaurav()
{
	super.method();
	System.out.println("i am method child");
	super.method1();
	}
public static void main(String[] args) 
{
Swift obj=new Swift();
obj.gaurav();
}
}
