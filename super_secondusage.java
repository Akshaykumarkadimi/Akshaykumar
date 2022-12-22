import java.io.*;
import java.util.*;
class A
{
  int i;
  void showi()
  {
    System.out.println("In class A:i="+i);
  }
}
class B extends A
{
  int i;
  void set(int a,int b)
  {
    super.i=a;
    i=b;
  }
  void showi()
  {
    System.out.println("In class B:super.i= "+super.i+" and subclass = "+i);
  }
}
class super_secondusage
{
  public static void main(String args[])
  {
    A ob1=new A();
    ob1.i=10;
    ob1.showi();
    B ob2=new B();
    ob2.set(20,30);
    ob2.showi();
  }
}