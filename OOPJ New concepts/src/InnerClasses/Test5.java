package InnerClasses;

public class Test5 {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine();  // Car(class).Engine(InnerClass) engine(Instance)= car.new Engine();

        engine.start();
        engine.stop();
    }
}
