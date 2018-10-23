public class OopsConce {
    public static void main(String[] args) {
        System.out.println("Welcome to " + Employee.getBankName());
        System.out.println("'id\\sno'\t\t name\t\t salary\t\t fatherName\t\t noOfEmp");


        Employee obj = new Employee(1, "parul", 50000, "pp");
        System.out.println(obj.getId() + "\t\t" + obj.getName() + "\t" + obj.getSalary() + "\t" + obj.getFatherName() + "\t" + Employee.getNoOfEmployee());
        Employee bhu = new Employee(2, "bhu", 1000, "ss");
        System.out.println(bhu.getId() + "\t" + bhu.getName() + "\t" + bhu.getSalary() + "\t" + bhu.getFatherName() + "\t" + Employee.getNoOfEmployee());

    }
    //todpriovate
}


class Employee {
    // encapsulated class
    // values can be assigned only at the time of object creation
    // reading values is done by public getters

    private static int noOfEmployee = 0;
    private static String bankName = "Allahabaad Bank";
    private String name;
    private int salary;
    private int id;
    private String fatherName;

    Employee(int id, String nm, int sal, String fatherName) {
        this.id = id;
        this.name = nm;
        this.salary = sal;
        this.fatherName = fatherName;
        noOfEmployee++;
    }

    public static String getBankName() {
        return bankName;
    }

    public static int getNoOfEmployee() {
        return noOfEmployee;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getFatherName() {
        return fatherName;
    }
}

//abstract class
abstract class Customer {
    abstract void depositMoney(int dep);

    abstract void withDraw(int money);

    abstract int getMoney();

}

//inheritance
class CustomerService extends Customer {
    private int id;
    private String name;
    private int accBalance;
    private int accNo;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public static int getNoOfAccHolders() {
        return noOfAccHolders;
    }

    private static int noOfAccHolders;

    public CustomerService(int id, String name, int accNo) {
        this.id = id;
        this.name = name;
        this.accNo = accNo;
        noOfAccHolders++;
        this.accBalance = 0;
    }

    @Override
    void depositMoney(int dep) {
        accBalance += getMoney();
    }

    @Override
    void withDraw(int money) {
        if (getMoney() < money) {
            System.out.println("Your balance is kam");
        } else {
            accBalance = getMoney() - money;
        }
    }

    @Override
    int getMoney() {
        return this.accBalance;

    }

}




