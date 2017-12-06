package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static th.ac.kmitl.science.comsci.example.models.mock.PostalAddressMock.*;

public class PostalAddressTest {

    @Test
    public void canCreatePostalAddressWithAllAttribute() {
        PostalAddress postalAddress = generateMockPostalAddressWithAllAttribute();

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
        PostalAddress postalAddress = generateMockPostalAddressWithSomeAttribute();

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