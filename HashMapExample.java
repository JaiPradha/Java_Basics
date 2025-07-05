import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Adding entries
        students.put(101, "Jai");
        students.put(102, "Durga");
        students.put(103, "Haswin");

        // Getting a value
        System.out.println("Student with Roll No 102: " + students.get(102));

        // Looping through map
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
