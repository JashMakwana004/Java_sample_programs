import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        
        int r,rev = 0;
        while(n>0)
        {
            r = n%10;
            n = n/10;
            rev = rev * 10+r;
        }
        System.out.println(rev);
    }
}