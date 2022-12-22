import java.io.*;
import java.util.*;
class Box
{
  double width,height,depth;
  Box(double l)
  {
    width=l;
    height=l;
    depth=l;
  }
  Box(double w,double h,double d)
  {
    width=w;
    height=h;
    depth=d;
  }
  double volume()
  {
    return width*height*depth;
  }
}
class Box_weight extends Box
{
  double weight;
  Box_weight(double w,double h,double d,double we)
  {
    super(w,d,h);
    weight=we;
    System.out.println("weight="+weight);	
  }
}
class Super_firstusage
{
  public static void main(String args[])
  {
    double v1,v2,v3;
    Box b1=new Box(10);
    v1=b1.volume();
    System.out.println("volume of Box1 is"+v1);
    Box b2=new Box(10,20,30);
    v2=b2.volume();
    System.out.println("volume of Box2 is"+v2);
    Box_weight b3=new Box_weight(20,30,40,100);
    v3=b3.volume();
    System.out.println("volume of Box3 is"+v3);
  }
}
    