import java.util.*;
class forloop
{
    public static void main(String args[])
    {
        String str =new String("hello");
        System.out.println(str);
        String str1 = new String("world");
        System.out.println(str1);
        String str2 = str1;
        str1 = null;
        System.out.println(str2);
        System.out.println(str1);
    }
}
    