package th.ac.kmitl.science.comsci.example.models;

public class PostalAddressBuilder {
    private String postcodeCode;
    private String buildingName;
    private String lineOne;
    private String lineTwo;
    private String alley;
    private String village;
    private String villageNumber;
    private String streetName;
    private String cityName;
    private String citySubDivisionName;
    private String countryID;
    private String countrySubDivisionID;

    public PostalAddressBuilder withPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
        return this;
    }

    public PostalAddressBuilder withBuildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public PostalAddressBuilder withLineOne(String lineOne) {
        this.lineOne = lineOne;
        return this;
    }

    public PostalAddressBuilder withLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
        return this;
    }

    public PostalAddressBuilder withAlley(String alley) {
        this.alley = alley;
        return this;
    }

    public PostalAddressBuilder withVillage(String village) {
        this.village = village;
        return this;
    }

    public PostalAddressBuilder withVillageNumber(String villageNumber) {
        this.villageNumber = villageNumber;
        return this;
    }

    public PostalAddressBuilder withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public PostalAddressBuilder withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public PostalAddressBuilder withCitySubDivisionName(String citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
        return this;
    }

    public PostalAddressBuilder withCountryID(String countryID) {
        this.countryID = countryID;
        return this;
    }

    public PostalAddressBuilder withCountrySubDivisionID(String countrySubDivisionID) {
        this.countrySubDivisionID = countrySubDivisionID;
        return this;
    }

    public PostalAddress createPostalAddress() {
        return new PostalAddress(
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
    }
}