class forloop
{
    public static void main(String args[])
    {
       int i;
        for(i = 1;i<=10;i++)
        {
            if(i == 4)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("over");
    }
}