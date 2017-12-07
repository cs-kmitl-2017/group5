/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kmitl.science.comsci.example.models;

/**
 *
 * @author MicroComSci
 */
public class HeadForms {
    
    private String ExchangedDocument;
    private int Id;
    private String Name;
    private String IssueDateTime;
    private String Purpose;
    private int PurposeCode;
    private String CreationDateTime;
    private String IncludedNote;
    private String GlobalId;
    
    
    public String getIncludedNote() {
        return IncludedNote;
    }

    public void setIncludedNote(String IncludedNote) {
        this.IncludedNote = IncludedNote;
    }

    
    public String getCreationDateTime() {
        return CreationDateTime;
    }

    public void setCreationDateTime(String CreationDateTime) {
        this.CreationDateTime = CreationDateTime;
    }


    public String getGlobalId() {
        return GlobalId;
    }

    public void setGlobalId(String GlobalId) {
        this.GlobalId = GlobalId;
    }

    
    public int getPurposeCode() {
        return PurposeCode;
    }

    public void setPurposeCode(int PurposeCode) {
        this.PurposeCode = PurposeCode;
    }


    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    
    public String getIssueDateTime() {
        return IssueDateTime;
    }

    public void setIssueDateTime(String IssueDateTime) {
        this.IssueDateTime = IssueDateTime;
    }
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    

    public String getExchangedDocument() {
        return ExchangedDocument;
    }

    public void setExchangedDocument(String ExchangedDocument) {
        this.ExchangedDocument = ExchangedDocument;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    
    
}
