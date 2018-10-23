public class StringExample {
    public static void main(String[]args){
        String s1 = "parul" ; //by string literal
        char[] ch = {'p','a','r','u','l'};
        String s2 = new String(ch);   //converting char array[] to string
        String s3 = new String("parul");   //by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
