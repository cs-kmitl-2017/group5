package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostalAddressTest {

    @Test
    public void canCreatePostalAddress() {

        String postcodeCode = "10310";
        String buildingName = "อาคารพระจอมเกล้า";
        String lineOne = "ชั้น B ห้อง B01 คณะวิทยาศาสตร์ สถาบันเทคโนโลยีพระจอมเกล้า เจ้าคุณทหารลาดกระบัง";
        String lineTwo = "เลขที่ 1";
        String alley = "";
        String village = "";
        String villageNumber = "";
        String streetName = "ฉลองกรุง";
        String cityName = "ลาดกระบัง";
        String citySubDivisionName = "ลาดกระบัง";
        String countryID = "";
        String countrySubDivisionID = "";

        PostalAddress postalAddress = new PostalAddressBuilder()
                .withPostcodeCode(postcodeCode)
                .withBuildingName(buildingName)
                .withLineOne(lineOne)
                .withLineTwo(lineTwo)
                .withAlley(alley)
                .withVillage(village)
                .withVillageNumber(villageNumber)
                .withStreetName(streetName)
                .withCityName(cityName)
                .withCitySubDivisionName(citySubDivisionName)
                .withCountryID(countryID)
                .withCountrySubDivisionID(countrySubDivisionID)
                .createPostalAddress();

        assertEquals(postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(buildingName, postalAddress.getBuildingName());
        assertEquals(lineOne, postalAddress.getLineOne());
        assertEquals(lineTwo, postalAddress.getLineTwo());
        assertEquals(alley, postalAddress.getAlley());
        assertEquals(village, postalAddress.getVillage());
        assertEquals(villageNumber,postalAddress.getVillageNumber());
        assertEquals(streetName, postalAddress.getStreetName());
        assertEquals(cityName, postalAddress.getCityName());
        assertEquals(citySubDivisionName, postalAddress.getCitySubDivisionName());
        assertEquals(countryID, postalAddress.getCountryID());
        assertEquals(countrySubDivisionID, postalAddress.getCountrySubDivisionID());
    }
}