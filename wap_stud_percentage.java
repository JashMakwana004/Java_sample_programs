import java.util.*;
class Boxdemo
{
    public static void main(String args[])
    {
        Box b[] = new Box[10];
        for(int i=0;i<b.length;i++)
        {
            b[i] = new Box();
            b[i].setdata();
            System.out.println(b[i].volume());
            System.out.println(b[i].vol());
            b[i].vo();
            b[i].v();
        }
    }
}
class Box{
    int a1,e1,g1,n1,p,m11,m12,m13,m14,m15;
    public void setdata()
    {
        Scanner sin = new Scanner(System.in);
        a1=sin.nextInt();
        e1=sin.nextInt();
        g1=sin.next().charAt(0);
        n1=sin.next().charAt(0);
        p=sin.nextInt();
        m11=sin.nextInt();
        m12=sin.nextInt();
        m13=sin.nextInt();
        m14=sin.nextInt();
        m15=sin.nextInt();
    }
    public int volume()
    {
        System.out.println("total marks : ");
        return(m11+m12+m13+m14+m15);
    }
    public int vol()
    {
        System.out.println("per : ");
        return((m11+m12+m13+m14+m15)/5);
    }
    public void v()
    {
        if((m11+m12+m13+m14+m15)/5>75)
        {
            System.out.println("excellent");
        }
        else
        {
            System.out.println("good");
        }
    }
    public void vo()
    {
        if(a1>18)
        {
            System.out.println("Student can vote");
        }
        else
        {
            System.out.println("Student can not vote");
        }
    }
}