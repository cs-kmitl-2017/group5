package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.PostalAddressMock;

import static org.junit.Assert.assertEquals;

public class PostalAddressTest {

    @Test
    public void canCreatePostalAddressWithAllAttribute() {
        PostalAddress postalAddress = PostalAddressMock.generateMockPostalAddressWithAllAttribute();

        assertEquals(PostalAddressMock.postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(PostalAddressMock.buildingName, postalAddress.getBuildingName());
        assertEquals(PostalAddressMock.lineOne, postalAddress.getLineOne());
        assertEquals(PostalAddressMock.lineTwo, postalAddress.getLineTwo());
        assertEquals(PostalAddressMock.alley, postalAddress.getAlley());
        assertEquals(PostalAddressMock.village, postalAddress.getVillage());
        assertEquals(PostalAddressMock.villageNumber,postalAddress.getVillageNumber());
        assertEquals(PostalAddressMock.streetName, postalAddress.getStreetName());
        assertEquals(PostalAddressMock.city, postalAddress.getCity());
        assertEquals(PostalAddressMock.citySubDivision, postalAddress.getCitySubDivision());
        assertEquals(PostalAddressMock.countryID, postalAddress.getCountryID());
        assertEquals(PostalAddressMock.countrySubDivisionID, postalAddress.getCountrySubDivisionID());
    }

    @Test
    public void canCreatePostalAddressWithSomeAttribute() {
        PostalAddress postalAddress = PostalAddressMock.generateMockPostalAddressWithSomeAttribute();

        assertEquals(PostalAddressMock.postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(PostalAddressMock.buildingName, postalAddress.getBuildingName());
        assertEquals(PostalAddressMock.lineOne, postalAddress.getLineOne());
        assertEquals(PostalAddressMock.lineTwo, postalAddress.getLineTwo());
        assertEquals(null, postalAddress.getAlley());
        assertEquals(null, postalAddress.getVillage());
        assertEquals(null,postalAddress.getVillageNumber());
        assertEquals(PostalAddressMock.streetName, postalAddress.getStreetName());
        assertEquals(PostalAddressMock.city, postalAddress.getCity());
        assertEquals(PostalAddressMock.citySubDivision, postalAddress.getCitySubDivision());
        assertEquals(null, postalAddress.getCountryID());
        assertEquals(null, postalAddress.getCountrySubDivisionID());
    }
}