import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final int birthYear;
    private final String role; 

    public Person(String name, int birthYear, String role) {
        this.name = name;
        this.birthYear = birthYear;
        this.role = role;
    }

    @Override
    public String toString() {
        return name + ", sinh năm " + birthYear + ", vai trò: " + role;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Nguyen Van A", 2000, "Student"));
        people.add(new Person("Tran Thi B", 1985, "Lecturer"));
        people.add(new Person("Le Van C", 1990, "Staff"));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
