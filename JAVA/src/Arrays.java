import java.util.Scanner;

public class Arrays
{
    int b = 10;
    public static void main(String[] args) {
        int array[] = new int[5]; // int type object

        // i= array[0]
        // i = array[1]
        // for(int i=0;i<array.length;i++
        // [1,2,3,4,5] i = 1, i =2, i= 3;

        // array = {0,0,0,0,0} -> {1,2,3,4,5}

        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
        Arrays arrays = new Arrays();
        //Scanner std = new Scanner(System.in); // constructor parameter
        readElement(array); // arguments // array is an object so its reference will pass-> memory address
        System.out.println(arrays.b);
        //int b = 7; // local variable high priority
        arrays.changeVal();
        Arrays obj2 = new Arrays();
        System.out.println(obj2.b = 20); // output ?
        System.out.println(obj2.b); // output ?
        System.out.println(arrays.b); // print ?

        arrays.ret(arrays.b);
        obj2.ret(obj2.b);

    }

    static void readElement(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

     void changeVal() {
        b = 8;
    }

    void ret(int val)
    {
        System.out.println("hello "+val);
    }
}
