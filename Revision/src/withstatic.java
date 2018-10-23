public class withstatic
{
    public static void main(String[] args) {

        System.out.println("About to encounter a method");
        myMethod();
        System.out.println("Method was executed successfully");
    }


    public static void myMethod() {
        System.out.println("Printing from inside myMethod()");
    }
}

