package Abstraction;

public class Cycle extends Vehicle{

    public void accelerate(){
        System.out.println("wrooom");
    }

    @Override
    public void decelerate() {
        System.out.println("Breaks");
    }
}
