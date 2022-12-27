class forloop
{
    public static void main(String args[])
    {
        String s = "naman";
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        if(s.equalsIgnoreCase(s1))
        {
             System.out.println("pali");
        }
        else
        {
             System.out.println("not");
        }
    }
}