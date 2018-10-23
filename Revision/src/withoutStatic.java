public class withoutStatic
{

        public static void main(String[]args)
        {
            output obj=new output();

            System.out.println("About to encounter a method");
            obj.myMethod();
            System.out.println("Method was executed successfully");
        }
    }
   class output
   {
       public void myMethod()
       {
           System.out.println("Printing from inside myMethod()");
       }
   }
