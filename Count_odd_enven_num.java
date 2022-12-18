import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int countodd = 0;
        int counteven = 0;
        int i;
        for(i = 1;i<a;i++)
        {
            if(i%2 == 0)
            {
                countodd = countodd + 1;
            }
            else
            {
                counteven = counteven + 1;
            }
        }
        System.out.println(countodd);
        System.out.println(counteven);
    }
}