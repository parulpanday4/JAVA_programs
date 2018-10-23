import java.util.Scanner;

abstract class AbstractAdd1
{
    abstract void sum();
}
class AbstractAdd2 extends AbstractAdd1
{
    void sum()
    {

        System.out.println("Inside second class");
    }
}
class AbstractAdd
{
    public static void main(String[]args)
    {
        int a,b, add;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        add=a+b;
        System.out.println("add="+add);

        AbstractAdd2 obj=new AbstractAdd2 ();
        obj.sum();

    }
}