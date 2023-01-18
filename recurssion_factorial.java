import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Box b = new Box();
        int limit = 10;
        for(int i = 0;i<limit;i++)
        {
            System.out.println(f.fibonacciseries(i));
        }
    }
}
class Box
{
    public int fibonacciseries(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return1;
        }
        return(fibonacciseries(n-2)+fibonacciseries(n-1));
    }
}