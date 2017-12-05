package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CitySubDivisionTest {

    static int id = 0;
    static String name = "ลาดกระบัง";

    public static CitySubDivision createCitySubDivision() {
        return new CitySubDivision(id, name);
    }

    @Test
    public void canCreateCitySubDivision() {
        CitySubDivision city = new CitySubDivision(id, name);
        assertEquals(id, city.getId());
        assertEquals(name, city.getName());
    }
}