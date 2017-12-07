package th.ac.kmitl.science.comsci.example.mock;

import th.ac.kmitl.science.comsci.example.models.CodeMapping;

public class CodeMappingMock {

    public static int citySubDivisionId = 1;
    public static String citySubDivisionName = "ลาดกระบัง";

    public static int cityId = 1;
    public static String cityName = "ลาดกระบัง";

    public static int countrySubDivisionId = 10;
    public static String countrySubDivisionName = "กรุงเทพมหานคร";

    public static CodeMapping generateCitySubDivisionCodeMapping() {
        return new CodeMapping(citySubDivisionId, citySubDivisionName);
    }

    public static CodeMapping generateCityCodeMapping() {
        return new CodeMapping(cityId, cityName);
    }

    public static CodeMapping generateCountrySubDivisionCodeMapping() {
        return new CodeMapping(countrySubDivisionId, countrySubDivisionName);
    }
}
