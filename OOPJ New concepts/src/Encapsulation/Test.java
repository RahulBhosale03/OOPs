package Encapsulation;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Rahul");
        System.out.println(student.getName());

        student.setRollNumber(32);
        System.out.println(student.getRollNumber());

        student.setAge(22);
        System.out.println(student.getAge());
    }
}
