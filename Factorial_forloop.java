import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        
        int i,fact = 1;
        for(i = 1;i<=a;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}