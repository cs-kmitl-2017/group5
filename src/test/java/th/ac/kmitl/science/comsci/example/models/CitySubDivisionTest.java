package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.CitySubDivisionMock;

import static org.junit.Assert.*;

public class CitySubDivisionTest {

    @Test
    public void canCreateCitySubDivision() {
        CitySubDivision city = CitySubDivisionMock.generateMockCitySubDivision();
        assertEquals(CitySubDivisionMock.id, city.getId());
        assertEquals(CitySubDivisionMock.name, city.getName());
    }
}