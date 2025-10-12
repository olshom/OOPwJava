import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "New York");
        Person person2 = new Person("Bob", 25, "Los Angeles");
        Person person3 = new Person("Charlie", 35, "Chicago");
        Person person4 = new Person("Diana", 28, "Miami");
        Person person5 = new Person("Ethan", 40, "Seattle");
        Person person6 = new Person("Fiona", 22, "Boston");
        Person person7 = new Person("George", 33, "San Francisco");
        Person person8 = new Person("Hannah", 27, "Austin");
        Person person9 = new Person("Ian", 29, "Denver");
        Person person10 = new Person("Jane", 31, "Portland");

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        Comparator<Person> method = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        people.sort(method);
        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getCity());
        }

        Comparator<Person> lambda = (p1, p2) -> p1.getName().compareTo(p2.getName());
        people.sort(lambda);
        System.out.println("\nSorted by name:");
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getCity());
        }
    }
}
