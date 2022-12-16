import java.util.Scanner;
class if_else_scanner_class
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int i = sin.nextInt();
        if(i == 1)
        {
            System.out.println("a is true");

        }
        else
        {
            System.out.println("a is false");
        }
    }
}