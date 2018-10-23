interface A{
    void print();
}
class printable implements A{
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String[]args)
    {
        printable obj=new printable();
        obj.print();
    }
}