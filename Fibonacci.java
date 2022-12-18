import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        
        int i = 1, a = 0 , b = 1;
        System.out.println(a);
        System.out.println(b);
        int c;
        while(i<=n-2)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }
}