public class ParamConstructor
{
    int empid;
    String empName;
    ParamConstructor(int id,String name)
    {
        this.empid=id;
        this.empName=name;
    }
    void info()
    {
        System.out.println("Id:"+empid+ "Name:"+empName);
    }
    public static void main(String []args){
        ParamConstructor obj1 = new ParamConstructor(10,"parul");
        obj1.info();
    }
}
