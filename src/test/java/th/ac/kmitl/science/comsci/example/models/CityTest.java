package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CityTest {

    static int id = 0;
    static String name = "ลาดกระบัง";

    public static City createCity() {
        return new City(id, name);
    }

    @Test
    public void canCreateCity() {
        City city = new City(id, name);
        assertEquals(id, city.getId());
        assertEquals(name, city.getName());
    }
}