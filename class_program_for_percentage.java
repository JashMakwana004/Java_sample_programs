import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Box b[] = new Box[5];
        for(int i=0;i<b.length;i++)
        {
            b[i] = new Box();
            b[i].setdata();
            System.out.println(b[i].volume());
        }
    }
}
class Box{
    int l;
    int b;
    int h;
    public void setdata()
    {
        Scanner sin = new Scanner(System.in);
        l=sin.nextInt();
        b=sin.nextInt();
        h=sin.nextInt();

    }
    public int volume()
    {
        return (l*b*h);
    }
}