import java.io.*;
import java.util.*;
class polygon
{
 double area(double a)
 {
   return a*a;
 }
 double area(double l,double b)
 {
   return l*b;
 }
 double area(double a,double b,double c)
 {
   double s,ar;
   s=(a+b+c)/2;
   ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
   return ar;
 }
}
class Polygon_Area
{
  public static void main(String args[])
  {
    double a,b,c,l;
    Scanner s=new Scanner(System.in);
    polygon p=new polygon();
    System.out.println("enter side of square");
    a=s.nextDouble();
    System.out.println("area of square is"+p.area(a));
    System.out.println("enter the sides of rectangle");
    l=s.nextDouble();
    b=s.nextDouble();
    System.out.println("area of rectangle is"+p.area(l,b));
    System.out.println("enter the three sides of triangle");
    a=s.nextDouble();
    b=s.nextDouble();
    c=s.nextDouble();
    System.out.println("area of triangle is"+p.area(a,b,c));
  }
}