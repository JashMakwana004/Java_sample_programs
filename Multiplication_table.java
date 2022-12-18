import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        
        int i;
        for(i = 1;i<=10;i++)
        {
            System.out.println(a*i);
        }
    }
}