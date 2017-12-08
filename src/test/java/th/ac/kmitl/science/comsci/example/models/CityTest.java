package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.mocks.CityMock.*;

public class CityTest {

    @Test
    public void canCreateCity() {
        City city = generateMockCity();
        assertEquals(id, city.getId());
        assertEquals(name, city.getName());
    }
}