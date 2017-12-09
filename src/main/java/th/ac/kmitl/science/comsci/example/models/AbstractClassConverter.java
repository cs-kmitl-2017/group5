package th.ac.kmitl.science.comsci.example.models;

public abstract  class AbstractClassConverter {

    public static String CreateTagXML(String tagName,Object tag) {
        return "<"+tagName+">"+tag.toString()+"</"+tagName+">";
    }       
}
