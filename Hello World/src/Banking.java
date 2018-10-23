public class Banking
{
    static String branch = "Shimla";
    static String ifsc = "Shimla0123";
    String UserName;
    int acc;
    int money;
    int users = 0;

    public Banking(String UserName, int acc){
        this.UserName = UserName;
        this.acc= acc;
        money = 0;
        System.out.println("Welcome"+UserName+"\n Your Acccount is"+acc);
        users++;
    }
    public void details() {
        System.out.println("Bank Branch :" + branch + "\n IFSC code:" + ifsc + "\n User Name :" + UserName +
                "\n account number:" + acc + "\n account balance:" + money);
    }

    public void addmoney(int added_money)
    {
        money=money+added_money;
        System.out.println("you have added"+added_money+" in your account"+"\n available balance is"+money );
    }

    public void withdrawmoney(int paise){
        if(paise>money) {
            System.out.println("there is no over overdraft sysytem here:-\n you have " + money + "in your accountwithdrawn limit is" + money);
        }
        else {
            money = money - paise;
            System.out.println("you have withdrawn" + paise + "from your account \n available balance is" + money);
        }
    }
    public void removeuser(String userName)
    {
        userName=null;

    }

    public void getusers(){
        System.out.println("number of users are"+users);
    }
}
class MainClas{
    public static void main(String[]args){
        Banking  obj1=new Banking("parul",234);
        obj1.addmoney(10);
        obj1.details();
        obj1.addmoney(20);

        Banking obj2=new Banking("shubhi",123);
        obj2.details();
        obj2.addmoney(20);
        obj2.withdrawmoney(10);
        obj2.details();

    }
}
