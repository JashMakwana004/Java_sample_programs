import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Box b1 = new Box();
        b1.area();
        b1.perimeter();
    }
}
class Box{
    Scanner sin = new Scanner(System.in);
    int r = sin.nextInt();
    double pi = 3.14;
    public void area()
    {
        System.out.println(pi*r*r);
    }
    public void perimeter()
    {
        System.out.println(pi*r*2);
    }
}