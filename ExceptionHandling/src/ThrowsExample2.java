public class ThrowsExample2
{
    int division(int a, int b)throws ArithmeticException
    {
        int t=a/b;
        return t;
    }
    public static void main(String []args)
    {
        ThrowsExample2 obj=new ThrowsExample2();
        try
        {
            System.out.println(obj.division(15,0));
        }
        catch (ArithmeticException e)
        {
            System.out.println("you should not divide number by zero");
        }
    }
}
