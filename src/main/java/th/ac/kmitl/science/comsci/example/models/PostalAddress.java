package th.ac.kmitl.science.comsci.example.models;

public class PostalAddress {

    private String postcodeCode;
    private String buildingName;
    private String lineOne;
    private String lineTwo;
    private String alley;
    private String village;
    private String villageNumber;
    private String streetName;
    private CodeMapping city;
    private CodeMapping citySubDivision;
    private String countryID;
    private CodeMapping countrySubDivision;

    public PostalAddress(
            String postcodeCode,
            String buildingName,
            String lineOne,
            String lineTwo,
            String alley,
            String village,
            String villageNumber,
            String streetName,
            CodeMapping city,
            CodeMapping citySubDivision,
            String countryID,
            CodeMapping countrySubDivision) {
        this.postcodeCode = postcodeCode;
        this.buildingName = buildingName;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.alley = alley;
        this.village = village;
        this.villageNumber = villageNumber;
        this.streetName = streetName;
        this.city = city;
        this.citySubDivision = citySubDivision;
        this.countryID = countryID;
        this.countrySubDivision = countrySubDivision;
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
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public CodeMapping getCity() {
        return city;
    }

    public void setCity(CodeMapping city) {
        this.city = city;
    }

    public CodeMapping getCitySubDivision() {
        return citySubDivision;
    }

    public void setCitySubDivision(CodeMapping citySubDivision) {
        this.citySubDivision = citySubDivision;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public CodeMapping getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(CodeMapping countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }
}
