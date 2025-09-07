package task3;

import java.io.Serializable;

public class Student implements Serializable {
    private static int totalStudents = 0;
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        totalStudents++;
        this.id=totalStudents;
        this.name=name;
        this.age=age;
    }

    public Student() {
        totalStudents++;
        this.id=totalStudents;
        name = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return name + " " + age + " years old.";
    }
}
