import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        
        int a[] = new int[n];

        for(int i = 0;i<a.length;i++)
        {
            a[i] = sin.nextInt();
        }
        Arrays.sort(a);
        for(int a1 : a)
        {
            System.out.println(a1);
        }
    }
}