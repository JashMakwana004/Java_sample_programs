import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int b = sin.nextInt();
        int j = sin.nextInt();
        int i;
        for(i = a;i<b;i++)
        {
            if(i%j == 0)
            {
            System.out.println(i);
            }
        }
    }
}