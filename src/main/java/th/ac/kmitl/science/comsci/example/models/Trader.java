package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;
import java.util.List;

public class Trader {

    private String id;
    private String globalId;
    private String name;
    private String taxId;
    private List<TradeContact> definedTradeContacts;
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
        setDefinedTradeContacts(new ArrayList<TradeContact>());
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

    public List<TradeContact> getDefinedTradeContacts() {
        return definedTradeContacts;
    }

    private void setDefinedTradeContacts(List<TradeContact> definedTradeContacts) {
        this.definedTradeContacts = definedTradeContacts;
    }

    public PostalAddress getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(PostalAddress postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }

    public Trader withDefinedTradeContact(TradeContact... tradeContacts) {
        for (TradeContact tradeContact : tradeContacts) {
            getDefinedTradeContacts().add(tradeContact);
        }
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Trader)) {
            return false;
        } else {
            Trader target = (Trader) obj;
            return this.getId().equals(target.getId())
                    && this.getGlobalId().equals(target.getGlobalId())
                    && this.getTaxId().equals(target.getTaxId());
        }
    }
}