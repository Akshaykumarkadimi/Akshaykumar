import java.io.*;
import java.util.*;
import java.lang.*;
class Box
{
	double width,height,depth;
	double volume(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
		return this.width*this.depth*this.height;
	}
}
class Usage_this
{
	public static void main(String args[])
	{
		double v;
		Box b=new Box();
		v=b.volume(10,20,30);
		System.out.println("volume of the box is :"+v);
	}
}