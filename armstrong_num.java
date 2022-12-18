import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        double sum = 0;
        int n1 = n;
        int n2 = n;
        int count = 0;
        int rem;
        int rem1;
        int i;
        while(n != 0)
        {
            rem = n % 10;
            count++;
            n = n/10;
        }
        System.out.println(count);
        while(n1 != 0)
        {
            rem1 =n1 % 10;
            sum = sum + Math.pow(rem1,count);
            n1 = n1/10;
        }
        System.out.println("sum : "+sum);
        if(n2 == sum)
        {
            System.out.println("arm no.");
        }
        else
        {
            System.out.println("not");
        }
    }
}