package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostalAddressTest {

    static String postcodeCode = "10310";
    static String buildingName = "อาคารพระจอมเกล้า";
    static String lineOne = "ชั้น B ห้อง B01 คณะวิทยาศาสตร์ สถาบันเทคโนโลยีพระจอมเกล้า เจ้าคุณทหารลาดกระบัง";
    static String lineTwo = "เลขที่ 1";
    static String alley = "";
    static String village = "";
    static String villageNumber = "";
    static String streetName = "ฉลองกรุง";
    static City city = CityTest.createCity();
    static CitySubDivision citySubDivision = CitySubDivisionTest.createCitySubDivision();
    static String countryID = "";
    static String countrySubDivisionID = "";

    public static PostalAddress createPostalAddressWithAllAttribute() {
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

    public static PostalAddress createPostalAddressWithSomeAttribute() {
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

    @Test
    public void canCreatePostalAddressWithAllAttribute() {
        PostalAddress postalAddress = createPostalAddressWithAllAttribute();

        assertEquals(postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(buildingName, postalAddress.getBuildingName());
        assertEquals(lineOne, postalAddress.getLineOne());
        assertEquals(lineTwo, postalAddress.getLineTwo());
        assertEquals(alley, postalAddress.getAlley());
        assertEquals(village, postalAddress.getVillage());
        assertEquals(villageNumber,postalAddress.getVillageNumber());
        assertEquals(streetName, postalAddress.getStreetName());
        assertEquals(city, postalAddress.getCity());
        assertEquals(citySubDivision, postalAddress.getCitySubDivision());
        assertEquals(countryID, postalAddress.getCountryID());
        assertEquals(countrySubDivisionID, postalAddress.getCountrySubDivisionID());
    }

    @Test
    public void canCreatePostalAddressWithSomeAttribute() {
        PostalAddress postalAddress = createPostalAddressWithSomeAttribute();

        assertEquals(postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(buildingName, postalAddress.getBuildingName());
        assertEquals(lineOne, postalAddress.getLineOne());
        assertEquals(lineTwo, postalAddress.getLineTwo());
        assertEquals(null, postalAddress.getAlley());
        assertEquals(null, postalAddress.getVillage());
        assertEquals(null,postalAddress.getVillageNumber());
        assertEquals(streetName, postalAddress.getStreetName());
        assertEquals(city, postalAddress.getCity());
        assertEquals(citySubDivision, postalAddress.getCitySubDivision());
        assertEquals(null, postalAddress.getCountryID());
        assertEquals(null, postalAddress.getCountrySubDivisionID());
    }
}