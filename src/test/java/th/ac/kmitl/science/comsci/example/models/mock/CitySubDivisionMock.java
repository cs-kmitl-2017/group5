package th.ac.kmitl.science.comsci.example.models.mock;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.CitySubDivision;

import static org.junit.Assert.assertEquals;

public class CitySubDivisionMock {

    public static int id = 0;
    public static String name = "ลาดกระบัง";

    public static CitySubDivision generateMockCitySubDivision() {
        return new CitySubDivision(id, name);
    }
}