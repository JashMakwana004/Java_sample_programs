import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        int n = sin.nextInt();
        Fact f = new Fact();
        System.out.println(f.factorial(n));
    }
}
class Box{
    public int factorial(int n)
    {
        if(n=0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}