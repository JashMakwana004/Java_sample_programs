import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);

        Box b1 = new Box();
        b1.length = sin.nextInt();
        b1.breadth = sin.nextInt();
        b1.height = sin.nextInt();
        b1.volume();

    }
}
class Box{
    int length;
    int breadth;
    int height;
    public void volume()
    {
        
        System.out.println(length*breadth*heigth);
    }
}