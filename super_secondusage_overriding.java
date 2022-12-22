import java.io.*;
import java.util.*;
class A
{
  int i;
  void show()
  {
    System.out.println("In class A:i="+i);
  }
}
class B extends A
{
  int j;
  void set(int a,int b) 
  {
    i=a;
    j=b;
  }
  void show()
  {
    super.show();
    System.out.println("In class B:super.i= "+super.i+" and subclass j= "+j);
  }
}
class super_secondusage_overriding
{
  public static void main(String args[])
  {
    A ob1=new A();
    ob1.i=10;
    ob1.show();
    B ob2=new B();
    ob2.set(20,30);
    ob2.show();
  }
}