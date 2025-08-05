package Interface.Animals;

public interface Animal {

    void  eat();

    void sleep();


    int MAX_AGE = 20;  // constant


    // for static method

    public static void info(){
        System.out.println("This is a interface.");
    }

    public default void run(){
        System.out.println("Animal is running");
    }


}
