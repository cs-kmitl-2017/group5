package th.ac.kmitl.science.comsci.example.models.mock;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.City;

import static org.junit.Assert.assertEquals;

public class CityMock {

    public static int id = 0;
    public static String name = "ลาดกระบัง";

    public static City generateMockCity() {
        return new City(id, name);
    }

    @Test
    public void canCreateCity() {
        City city = new City(id, name);
        assertEquals(id, city.getId());
        assertEquals(name, city.getName());
    }
}