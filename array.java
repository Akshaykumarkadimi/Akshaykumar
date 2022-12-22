import java.io.*;
import java.util.*;
class array
{
	public static void main(String args[])
	{
		int n,i;
		int a[]=new int[20];
		System.out.println("enter size: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("enter elements to array :");
		for(i=0;i<n;i++)
		{ 
			a[i]=s.nextInt();
		}
		System.out.print("Elements of an array :");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}