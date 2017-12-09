package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.models.ExchangedDocument;

public class ExChangedDocumentConverter extends AbstractClassConverter  {
      
    public static String getXML(ExchangedDocument exchangedDocument) {        
        String headTagName="rsm:CIExchangedDocumentContext";
        String idTagName="ram:ID";
        String nameTagName="ram:Name";      
        String typeCodeTagName="ram:TypeCode";
        String issueDateTimeTagName="ram:IssueDateTime";
        String purposeTagName="ram:Purpose";
        String purposeCodeTagName="ram:PurposeCode";
        String globalIdTagName="ram:GlobalID";
        String creationDateTimeTagName="ram:CreationDateTime";
        String includedNoteTagName="ram:IncludedCINote";
        String subjectTagName="ram:IncludedCINote"; 
        String contentTagName="ram:IncludedCINote";
    
        String xml="<"+headTagName+">"
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
