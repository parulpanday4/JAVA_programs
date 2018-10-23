public class ThrowsExample
{
    void method1()throws ArithmeticException
    {
        throw new ArithmeticException("calculation error");
    }
    void method2()throws ArithmeticException
    {
        method1();
    }
    void method3(){
        try{
            method1();
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception handled");
        }
    }
    public static void main(String[]args)
    {
        ThrowsExample obj=new ThrowsExample();
        obj.method3();
    }
}
