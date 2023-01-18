import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {

    }
}
class Box
{
    public string revstar(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        return revstar(str.substring(1))+str.charAt(0);
    }
}