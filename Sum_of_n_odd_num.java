import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int sum = 0;
        int i;
        for(i = 1;i<=a;i++)
        {
            if(i%2 != 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("sum"+sum);
    }
}