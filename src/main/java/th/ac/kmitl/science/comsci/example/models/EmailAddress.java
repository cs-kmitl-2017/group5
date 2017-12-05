package th.ac.kmitl.science.comsci.example.models;

public class EmailAddress extends TradeContact {

    private String uriId;
    private String completeNumber;

    public EmailAddress(String uriId, String completeNumber) {
        this.setUriId(uriId);
        this.setCompleteNumber(completeNumber);
    }

    public String getUriId() {
        return uriId;
    }

    public void setUriId(String uriId) {
        this.uriId = uriId;
    }

    public String getCompleteNumber() {
        return completeNumber;
    }

    public void setCompleteNumber(String completeNumber) {
        this.completeNumber = completeNumber;
    }
}
