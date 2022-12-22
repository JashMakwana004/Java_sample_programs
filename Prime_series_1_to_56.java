import java.util.Scanner;
class forloop
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int count = 0;
      
       // int i,fact = 1;
        for(int i = 1;i<=n;i++)
        {
            int flag = 0;
            for(int j = 2; j<i ; j++)
            {
                 if(i%j==0)
                 {
                    flag = 1;
                    break;
                 }
            }
            if(flag == 0)
            {
                System.out.println(i);
                count++;
            }
        
        }
        System.out.println(count);
    }
}