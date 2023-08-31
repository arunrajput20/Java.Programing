class calci{
    private int i;
    private int j;
    calci(int x,int y)
    {
        i=x;
        j=y;
}
    public void add()
    {
        System.out.println("i+j");
    }
    public void sub()
    {
        System.out.println("i-j");
    }
    public void mul()
        {
            System.out.println("i*j");
        }
        public void div()
        {
            System.out.println("i/j");
        }
}
        public class A
        {
            public static void main(String[] args)
        {
            calci c= new calci(3,4);
            c.add();
            c.sub();
            c.mul();
            c.div();
        }
        }
