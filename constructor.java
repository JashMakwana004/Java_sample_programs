import java.util.*;
class constructor
{
    public static void main(String args[])
    {
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.y);
    }
}
class Test
{
    int x,y;
    public Test()
    {
        x = 10;
        y = 20;
    }
}