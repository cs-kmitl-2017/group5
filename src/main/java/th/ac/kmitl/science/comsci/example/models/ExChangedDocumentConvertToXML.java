package th.ac.kmitl.science.comsci.example.models;
import th.ac.kmitl.science.comsci.example.models.ExchangedDocument;
public class ExChangedDocumentTag extends AbstractClassMappedTag  {
    
    private String idTagName="";
    private String nameTagName="";    
    private String typeCodeTagName="";
    private String issueDateTimeTagName="";
    private String purposeTagName="";
    private String purposeCodeTagName="";
    private String globalIdTagName="";
    private String creationDateTimeTagName="";
    private String includedNoteTagName="";
    private String subjectTagName="";    
    private String contentTagName="";
    
    private String idTag="";
    private String nameTag="";    
    private String typeCodeTag="";
    private String issueDateTimeTag="";
    private String purposeTag="";
    private String purposeCodeTag="";
    private String globalIdTag="";
    private String creationDateTimeTag="";
    private String includedNoteTag="";
    private String subjectTag="";    
    private String contentTag="";
    
    private String subTag;
    ExchangedDocument exchangedDocument;
    
     ExChangedDocumentTag(ExchangedDocument exchangedDocument){
     this.exchangedDocument=exchangedDocument;
     headTagName="rsm:CIExchangedDocumentContext";
     idTagName="ram:ID";
     nameTagName="ram:Name";    
     typeCodeTagName="ram:TypeCode";
     issueDateTimeTagName="ram:IssueDateTime";
     purposeTagName="ram:Purpose";
     purposeCodeTagName="ram:PurposeCode";
     globalIdTagName="ram:GlobalID";
     creationDateTimeTagName="ram:CreationDateTime";
     includedNoteTagName="ram:IncludedCINote";
     subjectTagName="ram:IncludedCINote";    
     contentTagName="ram:IncludedCINote";      
    }

    @Override
    public String getSubTag() {
    subTag=idTag+nameTag+typeCodeTag+issueDateTimeTag+purposeTag+purposeCodeTag+globalIdTag+creationDateTimeTag+includedNoteTag+subjectTag+contentTag;
    return subTag;
    }

    @Override
    public void setSubTag() {
        idTag=CreateSubTag(idTagName,exchangedDocument.getId());
        nameTag=CreateSubTag(nameTagName,exchangedDocument.getName());
        typeCodeTag=CreateSubTag(typeCodeTagName,exchangedDocument.getTypeCode());
        issueDateTimeTag=CreateSubTag(issueDateTimeTagName,exchangedDocument.getIssueDateTime());
        purposeTag=CreateSubTag(purposeTagName,exchangedDocument.getPurpose());
        purposeCodeTag=CreateSubTag(purposeCodeTagName,exchangedDocument.getPurposeCode());
        globalIdTag=CreateSubTag(globalIdTagName,exchangedDocument.getGlobalId());
        creationDateTimeTag=CreateSubTag(creationDateTimeTagName,exchangedDocument.getCreationDateTime());
        includedNoteTag=CreateSubTag(includedNoteTagName,exchangedDocument.getIncludedNote());
        subjectTag=CreateSubTag(subjectTagName,exchangedDocument.getSubject());
        contentTag=CreateSubTag(contentTagName,exchangedDocument.getContent());
    }
   
}
