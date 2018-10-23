
abstract class AbstractacExample {
   abstract void run();
}
class SC extends AbstractacExample{
    void run(){
        System.out.println("run");
    }

    public static void main(String[] args)
    {
        SC obj = new SC();
        obj.run();
    }
}
//Example
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drwaing circle");
    }
}
class TestAbstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

    }
}
//Another Example
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate Of Interest is:"+b.getRateOfInterest()+"%");
        b =new PNB();
        System.out.println("Rate Of Interest is:"+b.getRateOfInterest()+"%");
    }
}
//example of abstract class that has abstract and non-abstract methods
abstract class Bike{
    Bike(){
        System.out.println("constructor is created");
    }
    abstract void run();    //abstract method
    void changeGear(){      //non-abstract method
        System.out.println("Non abstract method");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("running safely");
    }
}
//main class which calls abstract and non-abstract methods
class Test{
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
//Interface
interface  First{
    void a();
    void b();
    void c();
    void d();

}
abstract class Second implements First{
    public void c(){
        System.out.println("I am c");
    }
}
class M extends Second{
    public void a(){
        System.out.println("I am A");
    }
    public void b(){
        System.out.println("I am B");
    }
    public void d(){
        System.out.println("I am D");
    }
}
class TestInterface{
    public static void main(String[] args) {
        First obj = new M();
        obj.a();
        obj.b();
        obj.c();
        obj.d();

    }
}
//interface example
interface Interface1{
    void add();
}
class Interface2 implements Interface1{
    public void add(){
        System.out.println("add");
    }
}
class MainClass{
    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        obj.add();
    }
}
//Multiple Inheritance through interface
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class TestMultipleInhertance implements Printable,Showable {
    public void print(){
        System.out.println( "Hello");
    }
    public void show(){
        System.out.println("World");
    }
    public static void main(String[] args) {
          TestMultipleInhertance obj = new TestMultipleInhertance();
          obj.print();
          obj.show();
    }
}
//static methods in interface
interface Draw{
    void add();
//    static int mul(int x){
//        return x*x*x;
//    }
}
class Draw2 implements Draw{
    public void add(){
        System.out.println("add");
    }
}
class TestInterfacestactic{
    public static void main(String[] args) {
        Draw obj = new Draw2();
        obj.add();
        //System.out.println(Draw.mul(2));


    }
}//super used to refer immediate parent class instance variable
class Animal{
    String color = "white";
}
class Dog extends Animal{
    String  color = "black";
    void printcolor(){
        System.out.println(color);  //prints color of Dog class
        System.out.println(super.color);  //prints color of Animal class
    }
}
class TestSuper{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printcolor();
    }
}
//super used to invoke parent class method
class Animall{
    void eat(){
        System.out.println("method of base class");
    }
}
class Dogg extends Animal{
    void eat(){
        System.out.println("method of sub class");
    }
    void bark(){
        System.out.println("another method of sub class");
    }
    void work(){
      //  super.eat();

        bark();
    }
}
class TestSuper1{
    public static void main(String[] args) {
        Dog obj = new Dog();
     //   obj.work();

    }
}
//super class used to invoke parent class consructor
class Animal1{
    Animal1(){
        System.out.println(" constructor of base class");
    }
}
class Dog1 extends Animal1{
    Dog1(){
        super();
        System.out.println("constructor of sub class");
    }


}
class TestSuper2{
    public static void main(String[] args) {
        Dog obj = new Dog();

    }
}
//super class real use
class Person{
    int id;
    String name;
    Person(int i , String nm){
        this.id = i;
        this.name = nm;
    }
}
class Emp extends Person{
    float salary;
    Emp(int i, String nm,float sal){
        super(i,nm);    //reusing parent constructor
        this.salary  = sal;
    }
    void dispaly(){
        System.out.println("id"+"name"+"salary");
    }
}
class TestSuperr{
    public static void main(String[] args) {
        Emp obj = new Emp(1,"pp",30000);
        obj.dispaly();
    }
}