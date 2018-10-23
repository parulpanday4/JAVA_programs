abstract class Bike
{
    Bike()
    {
        System.out.println("constructor");                       //constructor
    }
    abstract void run();                                         //abstract method
    void changeGear()                                            //method
    {
        System.out.println("GearChanged");
    }
}
class Honda extends Bike
{

    void run()
    {
        System.out.println("Running Safely");
    }
}
class Abs
{
    public static void main(String []args)
    {
        Honda obj=new Honda();
        obj.run();
        obj.changeGear();
    }
}
