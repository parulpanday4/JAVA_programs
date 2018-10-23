public class AddingLowerType {
    public static void main(String args[]){
        byte a = 10;
        byte b = 20;
        //byte c=a+b;//it will give compile time error:because a+b =30 will be int
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}
