import java.io.*;
import java.util.*;
class Swap_passbyvalue
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enete a and b values:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("before callin a= "+a+ "and b= "+b);
		Test t=new Test();
		t.swap(a,b);
		System.out.println("after
