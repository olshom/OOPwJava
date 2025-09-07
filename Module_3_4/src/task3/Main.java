package task3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        File f = new File(FILENAME);
        Student student1 = new Student("Olga Shomarova", 37);
        Course course1 = new Course("OOP", "Object oriented programming", "Matti Valovirta");
        Enrollment enrollment1 = new Enrollment(student1, course1, "18.08.2025");

        Student student2 = new Student("Alisa Shomarova", 37);
        Course course2 = new Course("OOP", "Object oriented programming", "Matti Valovirta");
        Enrollment enrollment2 = new Enrollment(student2, course2, "18.08.2025");

        ArrayList<Enrollment> enrollments = new ArrayList<>();
        enrollments.add(enrollment1);
        enrollments.add(enrollment2);

        try (FileOutputStream outputStream = new FileOutputStream(FILENAME);
             ObjectOutputStream objects = new ObjectOutputStream(outputStream);
        ) {
            objects.writeObject(enrollments);
        } catch (Exception e) {
            System.err.println(e);
        }

        try (FileInputStream inputStream = new FileInputStream(FILENAME);
        ObjectInputStream objects = new ObjectInputStream(inputStream);
        ) {
            //            Enrollment enrollment = new Enrollment();
            Enrollment[] enrollmentsDes = (Enrollment[]) objects.readObject();
//            var list = Arrays.stream(enrollmentsDes).toList();
            for(Enrollment enr: enrollmentsDes) {
                System.out.println(enr);
            }
        } catch (Exception e){
            System.err.println(e);
        }
    }
}
