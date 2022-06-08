import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class PersonTester {

    @Test
    public void TestPersonNotBornDoesNotContainOrgans(){
        var person = new Person();
        assertNull(person.Organs);
    }

    @Test
    public void TestNameIsEmpty(){
        var person = new Person();
        assertNull(person.getName());
    }

    @Test
    public void TestNameIsNotEmpty(){
        var person = new Person();
        person.setName("Kurt");
        var expected = "Kurt";
        var actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void TestFoodIsInStomack(){
        var person = new Person();
        person.PersonIsBorn();
        person.EatFood("Banana");
        var expectedCount = 1;
        var itemsInStomack = person.GetStomack().ItemsInStomack;
        var actualCount = itemsInStomack.size();
        assertTrue(itemsInStomack.contains("Banana"));
        assertFalse(itemsInStomack.contains("Eple"));
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void TestNoStomack(){
        var person = new Person();
        var actual = person.GetStomack();
        assertNull(actual);
    }

    @Test
    public void TestStomackExists(){
        var person = new Person();
        person.PersonIsBorn();
        var actual = person.GetStomack();
        assertEquals("Stomack",actual.OrganName);
        assertNotNull(actual);
    }

    @Test
    public void TestPersonIsBornCreatesOrgans(){
        var person = new Person();
        person.PersonIsBorn();

        var expectedCount = 6;
        var actualCount = person.Organs.size();

        var kidneyOrgan = person.Organs.stream().filter(item -> item.OrganName == "Kidney");
        var Ovaries = person.Organs.stream().filter(item -> item.OrganName == "Ovaries");

        assertNotNull(kidneyOrgan);
        assertEquals(2,kidneyOrgan.count());
        assertEquals(0,Ovaries.count());
        assertEquals(expectedCount,actualCount);

    }


}
