public class Constructor {
    int id ;
    String name;
    void display(){
        System.out.println(id+""+name);
    }
//Default constructor that gives default values
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.display();
    }
}

//Parameterized contructor
class Param{
    int id;
    String name;
    Param(int i,String nm){
        id =i;
        name = nm;
    }
    //method to display values
    void display(){
        System.out.println(id+""+name);
    }

    public static void main(String[] args) {
        Param p = new Param(1,"parul");
        p.display();
    }
}

//Constructor Overloading

class ConsOver{
    int id;
    String name;
    int age;
    ConsOver(int i,String nm,int ag){
        id  = i;
        name = nm;
        age = ag;
    }
    ConsOver(int i,String nm){
        id = i;
        name = nm;

    }

    void display(){
        System.out.println(id+""+name+""+age);
    }

    public static void main(String[] args) {
        ConsOver obj1 = new ConsOver(1,"pp",22);
        ConsOver obj2 = new ConsOver(2,"parul");
        obj1.display();
        obj2.display();

    }
}
//static variable
class StaVar{
    int id;                   //instance variable
    String name;
    static String clg = "BBD";//static variable

    StaVar(int i ,String nm){
        id = i;
        name = nm;
    }
    void display(){
        System.out.println(id+""+"\t"+name+""+"\t"+clg);
    }

    public static void main(String[] args) {
     StaVar ob1 = new StaVar(1,"pp");
     ob1.display();
    }
}
//static method
class StatMethod{
    int id;
    String name;
    static String clg = "BBD";
    //static method to change the value of static variable
    static void change(){
        clg = "FGIET";
    }
    //constructor to initialize the variables
    StatMethod(int i ,String nm){
        id = i;
        name = nm;
    }
    void display(){
        System.out.println(id+""+"\t"+name+"\t"+clg);
    }

    public static void main(String[] args) {
        StatMethod.change();      //calling change method
        StatMethod s1 = new StatMethod(1,"parul");
        StatMethod s2 = new StatMethod(2,"shubhi");
        s1.display();
        s2.display();
    }

}
//static block
//static block executes before main method
class StaBlock{
    static {
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        System.out.println("hello parul");
    }
}

