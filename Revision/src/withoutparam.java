import java.util.Scanner;

public class withoutparam {
    void areaCircle() {
        System.out.print("Enter the radius");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float ar;
        ar = 22 / 7 * r * r;
        System.out.println("area=" + ar);
    }
}
    class mainMethod
    {
        public static void main(String[]args)
        {
            withoutparam obj=new withoutparam();
            obj.areaCircle();
        }
    }

