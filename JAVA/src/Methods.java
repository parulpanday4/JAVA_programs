public class Methods {
    public static void main(String[]args){
        String s1 = "Parul";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s2 = " pandey ";
        System.out.println(s2.trim());

        String s3 = "shubhi";
        System.out.println(s3.startsWith("sh"));
        System.out.println(s3.endsWith("n"));

        System.out.println(s3.charAt(3));

        System.out.println(s3.length());

        String s4 = new String("laddooo");
        String s5 = s4.intern();
        System.out.println(s5);

        int a = 10;
        String s = String .valueOf(a);
        System.out.println(s+10);

        String s6 = "Java is a programmimg language.Java is platfrom";

        String replaceString = s6.replace("Java","Kava");
        System.out.println(replaceString);

    }
}
