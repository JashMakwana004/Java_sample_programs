class Spacepyramid
{
    public static void main(String args[])
    {
        int i,j,space;
        for(i=1;i<=5;i++)
        {
            for(space = 1;space<=5-i;space++)
            {
                System.out.print(" ");
            }
            for(j = 1;j<=(2*i)-1;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }


    }
}