import java.io.*;
import java.util.*;
import java.lang.*;
class Decimaltobinary
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		n=s.nextInt();	
		String x=String.format("%08d",Integer.valueOf(Integer.toString(n,2)));
		System.out.println("equivalent binary number is :"+x);
	}
}

