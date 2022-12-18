import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int b = sin.nextInt();
        int i,sum = 0;
        for(i = a+1;i<b;i++)
        {
            if(i%5 == 0)
            {
                System.out.println(sum = sum + i);
            }
        }
        System.out.println("sum : "+sum);
    }
}