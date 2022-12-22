import Area.circledemo;
import java.util.*;
class Area_circle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		circledemo c=new circledemo();
		double r,a;
		System.out.println("enter radis of circle:");
		r=s.nextDouble();
		a=c.circleArea(r);
		System.out.println("area of circle:"+a);
	}
}