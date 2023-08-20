import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Collection2 {
    public static void main(String[] args) {

        Person person1 = new Person("Olya");
        Person person2 = new Person("Ivan");
        Person person3 = new Person("Anzhalika");
        Person person4 = new Person("Alexey");
        Person person5 = new Person("Yana");
        Person person6 = new Person("Andrey");
        Person person7 = new Person("Vlad");
        Person person8 = new Person("Anzhalika");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);

        personList.stream()
                .filter(person -> person.getName().equals("Anzhalika"))
                .forEach(System.out::println);
        personList.stream()
                .map(Person::getName)
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
        Optional<Person> optionalPerson = personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .findFirst();
        optionalPerson.ifPresentOrElse(System.out::println, null);


    }
}
