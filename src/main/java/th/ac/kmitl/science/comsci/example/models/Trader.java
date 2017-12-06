package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;
import java.util.List;

public class Trader {

    private String id;
    private String globalId;
    private String name;
    private String taxId;
    private List<UniversalCommunication> definedTradeContacts;
    private PostalAddress postalTradeAddress;

    public Trader(
            String id,
            String globalId,
            String name,
            String taxId) {
        this();
        this.id = id;
        this.globalId = globalId;
        this.name = name;
        this.taxId = taxId;
    }

    public Trader() {
        setDefinedTradeContacts(new ArrayList<UniversalCommunication>());
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

    public List<UniversalCommunication> getDefinedTradeContacts() {
        return definedTradeContacts;
    }

    private void setDefinedTradeContacts(List<UniversalCommunication> definedTradeContacts) {
        this.definedTradeContacts = definedTradeContacts;
    }

    public PostalAddress getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(PostalAddress postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }

    public Trader withDefinedTradeContacts(UniversalCommunication... traderContacts) {
        for (UniversalCommunication traderContact : traderContacts) {
            getDefinedTradeContacts().add(traderContact);
        }
        return this;
    }

    public Trader withPostalTradeAddress(PostalAddress postalTradeAddress) {
        setPostalTradeAddress(postalTradeAddress);
        return this;
    }
}