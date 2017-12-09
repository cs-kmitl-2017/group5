package th.ac.kmitl.science.comsci.example.models;

public abstract  class AbstractClassConverter {
    
    abstract public String getXML();
        
    public String CreateTagXML(String headSubTag,Object tag) {
        return "<"+headSubTag+">"+tag+"</"+headSubTag+">";
    }   
    
}
