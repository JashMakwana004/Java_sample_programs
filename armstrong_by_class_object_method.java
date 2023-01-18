import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
          Box b = new Box();
          b.setData();
    }
}
class Box{
    public void setData()
    {
        int count=0;
        int n = 153;
        int n1 = n;
        int n2 = n;
        double sum = 0;
        int rem1;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println("count : "+count);
        while(n1!=0)
        {
            rem1 = n1%10;
            sum = sum+Math.pow(rem1,count);
            n1 = n1/10;
        }
        System.out.println("sum : "+sum);
        if(sum == n2)
        {
            System.out.println("armstrong");

        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}