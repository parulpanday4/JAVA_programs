public class FinallyExample2
{
    public  static  void main(String[]args)
    {
        System.out.println(FinallyExample2.myMethod());            //classname.method
    }
    public  static int myMethod()
    {
        try{
            return 112;
        }
        finally{
            System.out.println("this is finally block");
            System.out.println("finally block ran even after return statement");
        }
    }
}
