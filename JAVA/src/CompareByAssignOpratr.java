public class CompareByAssignOpratr {
    public static void main(String[]args){
        String s1 = "parul";
        String s2 = new String ("parul");
        String s3 = "parul";
        System.out.println(s1==s2); //s2 refers to instance created in nonpool
        System.out.println(s1==s3);  // true because both refers to same instance

    }
}
