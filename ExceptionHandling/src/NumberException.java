public class NumberException
{
    public static void main(String[]args)
    {
        try{
            int num=Integer.parseInt("XYZ");
            System.out.println("num");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
    }
}
