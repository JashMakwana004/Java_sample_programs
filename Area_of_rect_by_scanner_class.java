import java.util.Scanner;
class Rectangle
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int b = sin.nextInt();
        int area = a * b;
        System.out.println("area of rectangle : "+area);
        
    }
}