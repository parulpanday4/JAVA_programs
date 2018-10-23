public class MultipleCatch
{
    public  static  void  main(String[]args)
    {
        try{
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print statement in try block");
        }
        catch (ArithmeticException e){
            System.out.println("Warning : Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound");
        }
        catch (Exception e){
            System.out.println("Some other Exception");
        }
        System.out.println("out of try-catch block");
    }

}
