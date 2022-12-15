class Spacepyramid
{
    public static void main(String args[])
    {
        int i,j,space;
        for(i=9;i>=1;i--)
        {
            for(space = 10;space>=5-i;space--)
            {
                System.out.print(" ");
            }
            for(j = 9;j>=(2*i)-1;j--)
            {
            System.out.print("*");
            }
            System.out.println();
        }


    }
}