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

    public PostalAddressBuilder setPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
        return this;
    }

    public PostalAddressBuilder setBuildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public PostalAddressBuilder setLineOne(String lineOne) {
        this.lineOne = lineOne;
        return this;
    }

    public PostalAddressBuilder setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
        return this;
    }

    public PostalAddressBuilder setAlley(String alley) {
        this.alley = alley;
        return this;
    }

    public PostalAddressBuilder setVillage(String village) {
        this.village = village;
        return this;
    }

    public PostalAddressBuilder setVillageNumber(String villageNumber) {
        this.villageNumber = villageNumber;
        return this;
    }

    public PostalAddressBuilder setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public PostalAddressBuilder setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public PostalAddressBuilder setCitySubDivisionName(String citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
        return this;
    }

    public PostalAddressBuilder setCountryID(String countryID) {
        this.countryID = countryID;
        return this;
    }

    public PostalAddressBuilder setCountrySubDivisionID(String countrySubDivisionID) {
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