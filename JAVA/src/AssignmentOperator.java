public class AssignmentOperator {
    public static void main(String[]args){
        short a = 10;
        short b = 10;
        a = (short)(a+b);
        // a= a+b then it will give compile time error
        System.out.println(a);

    }
}
