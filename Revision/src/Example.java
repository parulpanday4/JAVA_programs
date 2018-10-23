import java.util.Scanner;

public class Example
{

    public static void main(String[]args){
        String Fname,Lname;
        int sal;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name");
        Fname = sc.nextLine();

        System.out.println("Enter your salary");
        sal = sc.nextInt();

        System.out.println("Enter Second Name");
        Lname = sc.next();
        System.out.println("Your First name is="+Fname+""+"Your Last name is="+Lname +""+ "Your Salary is="+sal);
    }
}
