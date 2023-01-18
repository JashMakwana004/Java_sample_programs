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
        int c = 89;
        double sum = 0;
        int rem = 0;
        while(c>0)
        {
            rem = c%10;
            sum = sum*10+rem;
            c=c/10;
        }
        if(sum == c)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}