public class StringCompareByEqualsMethod {
    public static void main(String[]args){
        String s1 = "parul" ;
        String s2 = "parul" ;
        String s3 = new String("parul");
        String s4 = "pandey";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
