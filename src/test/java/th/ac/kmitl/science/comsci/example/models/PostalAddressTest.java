package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class PostalAddressTest {

    @Test
    public void canCreatePostalAddress() {

        String postcodeCode = "10310";
        String buildingName = "King's mongkut building";
        String lineOne = "เลขที่ 1";
        String lineTwo = "";
        String alley = "";
        String village = "";
        String villageNumber = "";
        String streetName = "Chalongkrung Rd.";
        String cityName = "ลาดกระบัง";
        String citySubDivisionName = "ลาดกระบัง";
        String countryID = "";
        String countrySubDivisionID = "";

        PostalAddress postalAddress = new PostalAddress(
                postcodeCode,
                buildingName,
                lineOne,
                lineTwo,
                alley,
                village,
                villageNumber,
                streetName,
                cityName,
                citySubDivisionName,
                countryID,
                countrySubDivisionID
        );

        Assert.assertEquals(postcodeCode, postalAddress.getPostcodeCode());
        Assert.assertEquals(buildingName, postalAddress.getBuildingName());
        Assert.assertEquals(lineOne, postalAddress.getLineOne());
        Assert.assertEquals(lineTwo, postalAddress.getLineTwo());
        Assert.assertEquals(alley, postalAddress.getAlley());
        Assert.assertEquals(village, postalAddress.getVillage());
        Assert.assertEquals(villageNumber,postalAddress.getVillageNumber());
        Assert.assertEquals(streetName, postalAddress.getStreetName());
        Assert.assertEquals(cityName, postalAddress.getCityName());
        Assert.assertEquals(citySubDivisionName, postalAddress.getCitySubDivisionName());
        Assert.assertEquals(countryID, postalAddress.getCountryID());
        Assert.assertEquals(countrySubDivisionID, postalAddress.getCitySubDivisionName());
    }
}