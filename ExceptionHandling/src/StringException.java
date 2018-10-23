public class StringException
{
    public static void main(String[]args)
    {
        try{
            String str = "parul";
            System.out.println(str.length());
            char c = str.charAt(0);
             c= str.charAt(40);           //incorrect
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String Error");
        }
    }
}
