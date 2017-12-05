package th.ac.kmitl.science.comsci.example.models;

public abstract class TraderContact {

    private String uriId;

    public TraderContact(String uriId) {
        this.uriId = uriId;
    }

    public String getUriId() {
        return uriId;
    }

    public void setUriId(String uriId) {
        this.uriId = uriId;
    }
}
