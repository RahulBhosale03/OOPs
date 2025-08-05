package Interface.Animals;

public class Test3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        System.out.println(Animal.MAX_AGE);  // constant call
        Animal.info();  // static method call

        dog.run();  // default method call
        cat.run();  // default method call

    }
}
