public class SwapWithXOR
{
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println("A = "+ a+" B = "+b);
        a= a ^ b; // bitwise xor 0101 xor 0100 = 0001
        b = b ^ a; // a = 1 now => 0100 xor 0001 => 0101 = 5
        a= a ^ b;  // b = 5 ; 0001 xor 0101 => 0100 -> 4
        System.out.println("A = "+ a+" B = "+b);


        int n = 4;
        int k =2;
        /*
        1,2,3,4
        1 xor 2 < k
        1 xor 3 < k
        1 xor 4 < k
        2 xor 3 < k
        2 xor 4 <k
        3 xor 4 <k
         */
        int nm = 0;
        for (int i = 1;i <= n-1;i++)
        {
            for(int j = i + 1 ; j<= n ; j++)
            {
                if ((i ^ j) < k)
                    nm = i ^ j;
            }
        }

        System.out.println(nm);
    }
}
