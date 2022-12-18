import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        
        int lastdigit,firstdigit,rem = 0;
        lastdigit = n % 10;
        while(n>0)
        {
            rem = n%10;
            n = n/10;
            
        }
        firstdigit = rem;
        System.out.println(lastdigit+firstdigit);
    }
}