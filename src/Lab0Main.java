import com.pa.Group;
import com.pa.Person;

public class Lab0Main {
    public static void main(String[] args) {

        Person person = new Person(1, "João");
        Person person2 = new Person(2, "António");
        System.out.println(person2.toString());

        Group group = new Group(person);
        group.addMember(person2);
        System.out.println(group.toString());

    }
}
