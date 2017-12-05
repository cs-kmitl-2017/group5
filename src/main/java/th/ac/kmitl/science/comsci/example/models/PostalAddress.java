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
    private String CityName;
    private String CitySubDivisionName;
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
            String cityName,
            String citySubDivisionName,
            String countryID,
            String countrySubDivisionID) {

        setPostcodeCode(postcodeCode);
        setBuildingName(buildingName);
        setLineOne(lineOne);
        setLineTwo(lineTwo);
        setAlley(alley);
        setVillage(village);
        setVillageNumber(villageNumber);
        setStreetName(streetName);
        setCityName(cityName);
        setCitySubDivisionName(citySubDivisionName);
        setCountryID(countryID);
        setCountrySubDivisionID(countrySubDivisionID);
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

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getCitySubDivisionName() {
        return CitySubDivisionName;
    }

    public void setCitySubDivisionName(String citySubDivisionName) {
        CitySubDivisionName = citySubDivisionName;
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
