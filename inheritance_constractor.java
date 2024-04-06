class A
{
    A()
    {
        this(69);
        System.out.println("super class");
        
    }
    A(int a)
    {
        System.out.println(a);
    }

}
class B extends A
{
    B()
    {
        this(20);
        System.out.println("sub class");
    }
    B(int b)
    {
        System.out.println(b);
    }
    public static void main(String args[])
    {
        new B();
    }
}