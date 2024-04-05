import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {
        // Creating a HashMap to store student names as keys and their ages as values
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        
        // Adding entries to the HashMap
        students.put("Jessica", 22);
        students.put("John", 23);
        students.put("Jordan", 21);
        students.put("Joe", 22);
        students.put("Jack", 24);
        
        // Printing the HashMap
        System.out.println(students);
    }
}
