import java.util.*;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        //int n = sin.nextInt();
        
        int a[] = new int[3];

        for(int i = 0;i<a.length;i++)
        {
            a[i] = sin.nextInt();
            for(int j = i + 1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        for(int i = 0 ; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}