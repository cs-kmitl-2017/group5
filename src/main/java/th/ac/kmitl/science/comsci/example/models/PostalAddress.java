package th.ac.kmitl.science.comsci.example.models;

public class PostalAddress {

    private String postcodeCode;
    private String buildingName;
    private String lineOne;
    private String lineTwo;
    private String alley;
    private String village;
    private String villageNumber;
    private String StreetName;
    private City city;
    private CitySubDivision citySubDivision;
    private String CountryID;
    private String CountrySubDivisionID;

    public PostalAddress(
            String postcodeCode,
            String buildingName,
            String lineOne,
            String lineTwo,
            String alley,
            String village,
            String villageNumber,
            String streetName,
            City city,
            CitySubDivision citySubDivision,
            String countryID,
            String countrySubDivisionID) {
        this.postcodeCode = postcodeCode;
        this.buildingName = buildingName;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.alley = alley;
        this.village = village;
        this.villageNumber = villageNumber;
        StreetName = streetName;
        this.city = city;
        this.citySubDivision = citySubDivision;
        CountryID = countryID;
        CountrySubDivisionID = countrySubDivisionID;
    }

    public String getPostcodeCode() {
        return postcodeCode;
    }

    public void setPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getVillageNumber() {
        return villageNumber;
    }

    public void setVillageNumber(String villageNumber) {
        this.villageNumber = villageNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public CitySubDivision getCitySubDivision() {
        return citySubDivision;
    }

    public void setCitySubDivision(CitySubDivision citySubDivision) {
        this.citySubDivision = citySubDivision;
    }

    public String getCountryID() {
        return CountryID;
    }

    public void setCountryID(String countryID) {
        CountryID = countryID;
    }

    public String getCountrySubDivisionID() {
        return CountrySubDivisionID;
    }

    public void setCountrySubDivisionID(String countrySubDivisionID) {
        CountrySubDivisionID = countrySubDivisionID;
    }
}
