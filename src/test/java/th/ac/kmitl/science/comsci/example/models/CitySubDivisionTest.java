package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.mocks.CitySubDivisionMock.*;

public class CitySubDivisionTest {

    @Test
    public void canCreateCitySubDivision() {
        CitySubDivision city = generateMockCitySubDivision();
        assertEquals(id, city.getId());
        assertEquals(name, city.getName());
    }
}