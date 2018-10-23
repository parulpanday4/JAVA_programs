public class class1
{
    String name;
    int age;
    static int noOfStudents=0;

    class1()
    {
        noOfStudents++;
    }
    public static int getnoOF()
    {
        return noOfStudents;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getage()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class UseOfStatic
{
    public static void main(String[]args)
    {
        class1 obj=new class1();
        obj.age=22;
        obj.name="parul";
        System.out.println(class1.getnoOF());
        class1 ob=new class1();
        System.out.println(ob.noOfStudents);   //by instance
        System.out.println(class1.getnoOF());  //by class name
    }
}