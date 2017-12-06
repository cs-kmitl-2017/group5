package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.City;
import th.ac.kmitl.science.comsci.example.models.CitySubDivision;
import th.ac.kmitl.science.comsci.example.models.PostalAddress;
import th.ac.kmitl.science.comsci.example.models.PostalAddressBuilder;

import static org.junit.Assert.assertEquals;

public class PostalAddressMock {

    public static String postcodeCode = "10310";
    public static String buildingName = "อาคารพระจอมเกล้า";
    public static String lineOne = "ชั้น B ห้อง B01 คณะวิทยาศาสตร์ สถาบันเทคโนโลยีพระจอมเกล้า เจ้าคุณทหารลาดกระบัง";
    public static String lineTwo = "เลขที่ 1";
    public static String alley = "";
    public static String village = "";
    public static String villageNumber = "";
    public static String streetName = "ฉลองกรุง";
    public static City city = CityMock.generateMockCity();
    public static CitySubDivision citySubDivision = CitySubDivisionMock.generateMockCitySubDivision();
    public static String countryID = "";
    public static String countrySubDivisionID = "";

    public static PostalAddress generateMockPostalAddressWithAllAttribute() {
        PostalAddress postalAddress = new PostalAddressBuilder()
                .withPostcodeCode(postcodeCode)
                .withBuildingName(buildingName)
                .withLineOne(lineOne)
                .withLineTwo(lineTwo)
                .withAlley(alley)
                .withVillage(village)
                .withVillageNumber(villageNumber)
                .withStreetName(streetName)
                .withCity(city)
                .withCitySubDivision(citySubDivision)
                .withCountryID(countryID)
                .withCountrySubDivisionID(countrySubDivisionID)
                .createPostalAddress();
        return postalAddress;
    }

    public static PostalAddress generateMockPostalAddressWithSomeAttribute() {
        PostalAddress postalAddress = new PostalAddressBuilder()
                .withPostcodeCode(postcodeCode)
                .withBuildingName(buildingName)
                .withLineOne(lineOne)
                .withLineTwo(lineTwo)
                .withStreetName(streetName)
                .withCity(city)
                .withCitySubDivision(citySubDivision)
                .createPostalAddress();
        return postalAddress;
    }
}