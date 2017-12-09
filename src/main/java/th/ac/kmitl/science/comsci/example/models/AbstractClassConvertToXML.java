package th.ac.kmitl.science.comsci.example.models;

public abstract  class AbstractClassMappedTag {
    
    public String headTagName="";
    
    public String getHeadTag() {
        return "<"+headTagName+">";
    }
    
    public void setHeadTag(String head) {
        headTagName=head;
    }    

    public String getCloseHeadTag() {
        return "</"+headTagName+">";       
    }
    
    abstract public String getSubTag();
    
    abstract public void setSubTag();
    
    public String CreateSubTag(String headSubTag,Object tag) {
        return "<"+headSubTag+">"+tag+"</"+headSubTag+">";
    }   
    public String getAllTag(){
        return getHeadTag()+getSubTag()+getCloseHeadTag();
    }
    
}
