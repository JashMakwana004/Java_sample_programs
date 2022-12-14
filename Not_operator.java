class notoperator{
       public static void main(String args[])
       {
        int a = 12 , b = 13 , c = 15;
        boolean bool = Boolean.parseBoolean(args[0]);
        if(!bool)
        {
            System.out.println("bool is false");

        }
        else
        {
            System.out.println("bool is true");
        }
       }
}