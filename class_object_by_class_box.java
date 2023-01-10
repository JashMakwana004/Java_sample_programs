import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Box b = new Box();
        b.volume();

    }
}
class Box{
    int length = 10;
    int breadth = 10;
    int heigth = 10;
    public void volume()
    {
        int vol = length*breadth*heigth;
        System.out.println(vol);
    }
}