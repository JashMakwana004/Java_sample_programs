import java.util.*;
class forloop
{
    public static void main(String args[])
    {
         Scanner sin = new Scanner(System.in);
         int n = sin.nextInt();
         int a[] = new int[n];
         for(int i =0;i<a.length;i++)
         {
            a[i] = sin.nextInt();
         }
         int sum = 0;int max =a[0];int min=a[0];
         for(int i=0;i<a.length;i++)
         {
            sum = sum+a[i];
            if(min>a[i])
            {
                min =a[i];
            }
            if(max<a[i])
            {
                max = a[i];
            }

         }
         System.out.println(sum);
         System.out.println(sum/a.length);
         System.out.println(min);
         System.out.println(max);
    }
}