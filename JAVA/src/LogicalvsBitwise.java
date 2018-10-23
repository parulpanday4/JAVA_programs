public class LogicalvsBitwise {
    public static void main(String[]args){
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a<b && a++<c);
                    //first cond is false so it doesn't checks second cond.
        System.out.println(a);
        System.out.println(a<b  & a++<c);
                   //checks both conditions.
        System.out.println(a);
    }
}
