//inheritence
public class Inheritence {
    float salary = 2000;
}
class SubClass extends Inheritence{
    int bonus = 1000;

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        System.out.println("salary is ="+obj.salary);
        System.out.println("bonus is  ="+obj.bonus);
    }
}
//Types of inheritance
//single inheritance
class A{
    void add(){
        System.out.println("add");
    }
}
class B extends A{
    void sub(){
        System.out.println("subtract");
    }
}
class TestInheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.add();
        obj.sub();

    }
}
//Mutilevel Inheritance
class Aa{
    void add(){
        System.out.println("add");
    }
}
class Bb extends Aa{
    void sub(){
        System.out.println("subtract");
    }
}
class Cc extends Bb{
    void div(){
        System.out.println("divide");
    }
}
class TestMultilevlInheritance{
    public static void main(String[] args) {
        Cc obj = new Cc();
        obj.div();
        obj.add();
        obj.sub();

    }
}
//Hierachical Inheritance
class One{
    void add(){
        System.out.println("add");
    }
}
class Two extends One{
    void sub(){
        System.out.println("subtract");
    }
}
class Three extends One{
    void div(){
        System.out.println("divide");
    }
}
class TestHieracchicalInheritance{
    public static void main(String[] args) {
        Three obj = new Three();
        obj.div();
        obj.add();


    }
}
