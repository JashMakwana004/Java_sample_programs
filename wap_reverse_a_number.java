import java.util.*;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin =new Scanner(System.in);
        int n = sin.nextInt();
        int a[] = new int[n];
        
        for(int i = 0;i<a.length;i++)
        {
            a[i] = sin.nextInt();
        }
        for(int i = a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}