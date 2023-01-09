import java.util.*;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin =new Scanner(System.in);
        int n = sin.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<a.length;i++)
        {
            a[i] = sin.nextInt();
        }
        int m = sin.nextInt();
        int b[] = new int(m);
        for(int i = 0;i<a.length;i++)
        {
            b[i] = sin.nextInt();
        }
        for(int i = 0;i<a.length;i++)
        {
            sum = a[i]+b[i];
            System.out.println(sum);
        }
    }
}
