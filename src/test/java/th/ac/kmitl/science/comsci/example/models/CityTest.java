package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.CityMock;

import static org.junit.Assert.assertEquals;

public class CityTest {

    @Test
    public void canCreateCity() {
        City city = CityMock.generateMockCity();
        assertEquals(CityMock.id, city.getId());
        assertEquals(CityMock.name, city.getName());
    }
}