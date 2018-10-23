public class Example1
{
    public  static void main(String[]args)
    {
        int num1,num2;

        try{
            num1=0;
            num2=62/num1;
            System.out.println("num2");
            System.out.println("out of try block");
        }
        catch (ArithmeticException e)
        {
            System.out.println("you should not divide a number by zero");
        }
        catch (Exception e)
        {
            System.out.println("Exception occured");
        }
        System.out.println("out of try-catch block");
    }
}
