import java.util.Scanner;

class Bank
 {
    int acno;
    float bal;
    String name;

    Scanner sc = new Scanner(System.in);
     void openAcc(){
         System.out.println("Enter your Account number");
         acno = sc.nextInt();
         System.out.println("Enter your Balance");
         bal = sc.nextFloat();
         System.out.println("Enter your name");
         name =  sc.next();
         System.out.println("Your name is="+name+"Your account num is="+acno+"Your Current balance is="+bal);
     }
     void deposit(){
         float amt;
         System.out.println("Enter amount you want to deposit");
         amt = sc.nextFloat();
         bal=bal+amt;
         System.out.println("Current balance is="+bal);
     }
     void withdrwal(){
         float amut;
         System.out.println("Enter amount you want to withdraw");
         amut = sc.nextFloat();

         bal=bal- amut;
         System.out.println("Current Balance is="+bal);
     }
}
class MainClass{
    public static void main(String args[]){
        Bank obj=new Bank();
        obj.openAcc();
        obj.deposit();
        obj.withdrwal();
    }
}