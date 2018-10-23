abstract class abs
{
    abstract void run();
}
class bike extends abs
{
    void run()
    {
        System.out.println("running safely");
    }
    public static void main(String []args)
    {
        bike obj=new bike();
        obj.run();
    }
}