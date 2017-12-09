package th.ac.kmitl.science.comsci.example.models;

public class EmailAddressConverter extends Converter {
    
    public static String getXML(EmailAddress emailAddress){
        String urlIdTagName="ram:URLID";
        String completeNumberTagName="ram:CompleteNumber";
        String xml=CreateTagXML(urlIdTagName,emailAddress.getUriId())
                  +CreateTagXML(completeNumberTagName,emailAddress.getCompleteNumber());
        return xml;
    }
}
