
abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("drwaing rectangle");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("drwaing circle");
    }
}
class TestAbstraction
{
    public static void main(String[]args)
    {
        Circle obj=new Circle();
        obj.draw();
    }
}