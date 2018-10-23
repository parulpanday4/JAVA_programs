interface inf1 {
    public void method1();
}
interface inf2 extends inf1 {
    public void method2();
}
public class InterfaceWithInherit implements inf2
{
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
    public static void main(String[]args)
    {
        InterfaceWithInherit obj=new InterfaceWithInherit();
        obj.method2();
        obj.method1();
    }
}

