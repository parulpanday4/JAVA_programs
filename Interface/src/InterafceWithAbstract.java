interface AB{
      void a();
      void b();
      void c();
      void d();

}
abstract class B implements AB {

    public void c() {
        System.out.println("I am c");
    }
}
class M extends B{

    public void a() {
        System.out.println("I am a");
    }
    public void b() {
        System.out.println("I am b");
    }
    public void d() {
        System.out.println("I am d");
    }
}
class InterfaceWithAbstract
{
    public static void main(String []args)
    {
        AB obj=new M();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
}