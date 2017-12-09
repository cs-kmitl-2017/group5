package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.models.ExchangedDocument;

public class ExChangedDocumentConverter extends AbstractClassConverter  {
    
    private String headTagName="rsm:CIExchangedDocumentContext";
    private String idTagName="ram:ID";
    private String nameTagName="ram:Name";      
    private String typeCodeTagName="ram:TypeCode";
    private String issueDateTimeTagName="ram:IssueDateTime";
    private String purposeTagName="ram:Purpose";
    private String purposeCodeTagName="ram:PurposeCode";
    private String globalIdTagName="ram:GlobalID";
    private String creationDateTimeTagName="ram:CreationDateTime";
    private String includedNoteTagName="ram:IncludedCINote";
    private String subjectTagName="ram:IncludedCINote"; 
    private String contentTagName="ram:IncludedCINote";    
    String xml;
    ExchangedDocument exchangedDocument;   

    public String getXML(ExchangedDocument exchangedDocument) {
    xml="<"+headTagName+">"
            +CreateTagXML(idTagName,exchangedDocument.getId())
            +CreateTagXML(nameTagName,exchangedDocument.getName())
            +CreateTagXML(typeCodeTagName,exchangedDocument.getTypeCode())
            +CreateTagXML(issueDateTimeTagName,exchangedDocument.getIssueDateTime())
            +CreateTagXML(purposeTagName,exchangedDocument.getPurpose())
            +CreateTagXML(purposeCodeTagName,exchangedDocument.getPurposeCode())
            +CreateTagXML(globalIdTagName,exchangedDocument.getGlobalId())
            +CreateTagXML(creationDateTimeTagName,exchangedDocument.getCreationDateTime())
            +CreateTagXML(includedNoteTagName,exchangedDocument.getIncludedNote())
            +CreateTagXML(subjectTagName,exchangedDocument.getSubject())
            +CreateTagXML(contentTagName,exchangedDocument.getContent())
        +"<"+headTagName+">";
    return xml;
    }           
}
