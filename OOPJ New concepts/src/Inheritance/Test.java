package Inheritance;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Bluetooth");
        System.out.println(dog.getName());

        dog.setAge(12);
        System.out.println(dog.getAge());

        dog.sayHello();
        dog.eat();


    }

}
