import java.util.*;
class input_value_into_object_by_constructor
{
    public static void main(String args[])
    {
        Test t = new Test(10,20);
        Test s = new Test(15,25);
        t.display();
        s.display();
        
    }
}
class Test{
    int x,y;    
    public Test(int a,int b)
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println(x+" "+y);
    }
}