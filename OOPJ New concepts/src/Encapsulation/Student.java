package Encapsulation;

public class Student {

    private String name;

    private int RollNumber;

    private int age;
//    private int x;

//name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//RollNumber
    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber < 0){
            rollNumber = 0 ;
        }
        RollNumber = rollNumber;
    }
//Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            System.out.println("Invalid Age");
        }else{
            this.age = age;
        }
    }
}
