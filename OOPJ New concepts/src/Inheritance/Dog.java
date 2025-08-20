package Inheritance;


public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("the Dog is eating");
    }

    @Override
    public void sayHello(){
        System.out.println("Meow meow");
    }
}
