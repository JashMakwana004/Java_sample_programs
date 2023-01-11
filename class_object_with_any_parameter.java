import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Box b1 = new Box();
        b1.setdata(2);
    }
}
class Box{
    int l;
    int b;
    int h;
    public void setdata(int l)
    {
        System.out.println("hi");

    }
    public int setdata(int l,int b)
    {
        System.out.println("world");
        return 0;
    }
}