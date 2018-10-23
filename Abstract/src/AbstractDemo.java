abstract class AbstractDemo1
 {
    abstract void sum();

}
class AbstractDemo2 extends AbstractDemo1
{
    void sum()
    {
        int a=10;
        int b=20;
        int add=a+b;
        System.out.println("add="+add);
    }
}
class AbstractDemo
{
    public static void main(String[]args)
    {
        AbstractDemo2 obj=new AbstractDemo2 ();
        obj.sum();
    }
}