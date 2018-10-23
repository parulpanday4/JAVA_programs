public class ThrowExample
{
    static void checkEligibility(int stuage,int stuweight)
    {
        if(stuage<12 && stuweight<40)
        {
            throw new ArithmeticException("student is not eligible for registration");
        }
        else{
            System.out.println("Student is eligible for reg.");
        }
    }
    public static void main(String[]args){
        System.out.println("Eligibility process");
        checkEligibility(15,40);
        System.out.println("Have a nice day");
    }
}
