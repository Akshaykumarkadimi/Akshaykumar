import java.io.*;
import java.util.*;
abstract class shape
{
  abstract void Numberofsides();
}
class Trapezoid extends shape
{
  void Numberofsides()
  {
    System.out.println("Trapezoid has 4 sides");
  }
}
class Triangle extends shape
{
  void Numberofsides()
  {
    System.out.println("Triangle has 3 sides");
  }
}
class Hexagon extends shape
{
  void Numberofsides()
  {
    System.out.println("Hexagon has 6 sides");
  }
}
class AbstractClass
{
  public static void main(String args[])
  {
    Trapezoid tr=new Trapezoid();
    tr.Numberofsides();
    Triangle t=new Triangle();
    t.Numberofsides();
    Hexagon h=new Hexagon();
    h.Numberofsides();
  }
}
