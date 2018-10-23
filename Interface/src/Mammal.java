interface Animal
{
    public void eat();
    public void travel();
}
public  class Mammal implements Animal
{
    public void eat() {
        System.out.println("Mammal eats");
    }
    public  void travel(){
        System.out.println("Mammal travels");
    }

    public  static void  main(String[]args)
    {
        Mammal obj=new Mammal();
        obj.eat();
        obj.travel();
    }
}

