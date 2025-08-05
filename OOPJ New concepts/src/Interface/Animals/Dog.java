package Interface.Animals;

public class Dog implements Animal {

    @Override
    public void eat(){
          System.out.println("dog is Eating");
      }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
