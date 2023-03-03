class Complex_number_by_class
{
    public static void main(String args[])
    {
        Test t1 = new Test(5,2);
        Test t2 = new Test(2,4);
        Test t3 = new Test();
        t3.add(t1,t2);
    }
}
class Test
{
    int real,im;
    public Test(int a,int b)
    {
        real = a;
        im = b;
    }
    public Test()
    {
        
    }

        public void add(Test t1,Test t2)
        {
            real = t1.real+t2.real;
            im = t1.im+t2.im;
            System.out.println(real+"i"+im);
        }
    
}