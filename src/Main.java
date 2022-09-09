import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();


        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        females.forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Excel", 32, "Software Engineer", Gender.MALE),
                new Person("Favour", 30, "Business Man", Gender.MALE),
                new Person("Wonder", 28, "Designer", Gender.FEMALE),
                new Person("Daniel", 22, "Robotics Engineer", Gender.MALE)

        );
    }
}
