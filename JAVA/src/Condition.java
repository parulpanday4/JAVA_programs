public class Condition
{
    public enum Dyan
    {
        Parul ,Roli;
    }
    public static void main(String[] args)
    {
        /*
        control statement -> if, else, switch, ternary; else if
        switch case can be done using only
         */
//        switch() // data type are fixed-> int , char , string, enum,
//        {
//            case 1:
//        }
        System.out.println(Dyan.Parul);

        int n =10;
        switch (n)
        {
            case 1:
                System.out.println("THis is case 1");

            case 10:
                System.out.println("THis is case 10");

            case 11:
                System.out.println("This is case 11");
                break;
        }


    }
}
