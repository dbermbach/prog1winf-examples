package berlin.tu.mcc.prog1.ws2425;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsingGenerics {
    public static void main(String[] args) {
        Map<Integer,Student> students = new HashMap<>();
        Student jane = new Student("Jane Doe", 42);
        Student john  = new Student("john doe", 123);
        students.put(jane.id,jane);
        students.put(john.id, john);
        System.out.println("List of students");
        System.out.println(students);
        System.out.println("Pretty list of students:");
        for(int i: students.keySet()){
            System.out.println("ID " + i + ": " + students.get(i).name);
        }
        List<Integer> allIDs = new ArrayList<>();
        allIDs.addAll(students.keySet());
        System.out.println("All student IDs: " + allIDs);

    }
}

class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}