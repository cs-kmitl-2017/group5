package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;
import java.util.List;

public class Trader {

    private String id;
    private String globalId;
    private String name;
    private String taxId;
    private List<TraderContact> definedTraderContacts;
    private PostalAddress postalTradeAddress;

    public Trader(
            String id,
            String globalId,
            String name,
            String taxId) {
        this();
        this.setId(id);
        this.setGlobalId(globalId);
        this.setName(name);
        this.setTaxId(taxId);
    }

    public Trader() {
        setDefinedTraderContacts(new ArrayList<TraderContact>());
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    protected void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    protected void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<TraderContact> getDefinedTraderContacts() {
        return definedTraderContacts;
    }

    private void setDefinedTraderContacts(List<TraderContact> definedTraderContacts) {
        this.definedTraderContacts = definedTraderContacts;
    }

    public PostalAddress getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(PostalAddress postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }

    public Trader withDefinedTradeContact(TraderContact... traderContacts) {
        for (TraderContact traderContact : traderContacts) {
            getDefinedTraderContacts().add(traderContact);
        }
        return this;
    }
}