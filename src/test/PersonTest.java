package test;

import com.pa.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetName(){
        Person p1 = new Person(1, "aaaa");
        assertEquals("aaaa" , p1.getName());
    }

    @Test
    public void testGetID(){
        Person p1 = new Person(1, "João");
        assertEquals(1, p1.getId());
    }

    @Test
    public void testSetID(){
        Person p1 = new Person(4 , "António");
        p1.setId(2);
        assertEquals(2, p1.getId());

    }

    @Test
    public void testSetName(){
        Person p1 = new Person(3 , "Zé");
        p1.setName("José");
        assertEquals("José", p1.getName());
    }
}
