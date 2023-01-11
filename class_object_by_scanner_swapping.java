import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);

        Box b1 = new Box();
        //b1.length = sin.nextInt();
        b1.b = sin.nextInt();
        b1.h = sin.nextInt();
        b1.setdata(b,h);
        b1.volume();

    }
}
class Box{
    int length = 10;
    int breadth;
    int height;
    public void volume()
    {
        
        System.out.println(length*breadth*heigth);
    }
    public void setdata(int bread,int hei)
    {
        breadth=bread;
        height = hei;
    }
}