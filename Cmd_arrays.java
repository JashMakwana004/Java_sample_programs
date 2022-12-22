import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=Integer.parseInt(args[i]);
            System.out.println(a[i]);
        }
        
        
    }
}