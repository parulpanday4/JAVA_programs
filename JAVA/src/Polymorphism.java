//Method Overriding - changing no of arguments
public class Polymorphism {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }

}
class TestOverload{
    public static void main(String[] args) {
        System.out.println(Polymorphism.add(10,12));
        System.out.println(Polymorphism.add(10,20,30));
    }
}
//Changing datatype of arguments
class Polymorphism1{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    public static void main(String []args){
        System.out.println(Polymorphism1.add(10,20));
        System.out.println(Polymorphism1.add(10.0,20.0));
    }
}
//Method Overriding
class Vehicle{
    void run(){
        System.out.println("method of super class");
    }
}
class Vehicle1 extends Vehicle{
    void run(){
        System.out.println("method of sub class");
    }
}
class TestOverriding{
    public static void main(String[] args) {
        Vehicle1 obj = new Vehicle1();
        obj.run();
    }
}
//Final Keyword
//1- Final variable
class FinalVar{
    final int a = 100;
    void run(){
       // a = 3000;    we can't change the value of a var that is declared as final
    }

    public static void main(String[] args) {
        FinalVar obj = new FinalVar();
        obj.run();
    }
}

//Final Method
class FinalMethod{
    final void run(){
        System.out.println("super class method");
    }
}
class FinalMethod2 extends FinalMethod{
   // void run(){            a method declared as final in super class,we can't override it.
        //System.out.println("sub class  method");
    }
//}
class TestFinal{
    public static void main(String[] args) {
        FinalMethod2 obj= new FinalMethod2();
        obj.run();
    }
}

//Final class

final class FinalClass{

}
//class FinalClass1 extends FinalClass{      //if a class declared as final,we cann't extend it

//Runtime Polymorphism
class RuntimePoly{
    void run(){
        System.out.println("method of  super class");
    }
}
class RuntimePoly1 extends RuntimePoly{
    void run(){
        System.out.println("method of sub class");
    }
}
class TestRunPoly{
    public static void main(String[] args) {
        RuntimePoly obj = new RuntimePoly1();
        obj.run();
    }
}
