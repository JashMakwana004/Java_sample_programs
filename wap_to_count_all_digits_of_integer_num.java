import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
          Box b1 = new Box();
        b1.count();
    }
}
class Box{
    public void count()
    {
        int count = 0;
        int rem;
        int n = 75654;
        while(n!=0)
        {
            rem = n%10;
            count++;
            n = n/10;
        }
        System.out.println("total no. : "+count);
    }
}
