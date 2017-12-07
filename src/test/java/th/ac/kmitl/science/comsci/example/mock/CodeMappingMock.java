package th.ac.kmitl.science.comsci.example.mock;

import th.ac.kmitl.science.comsci.example.models.CodeMapping;

public class CodeMappingMock {

    public static int id;
    public static String name;

    public static CodeMapping generateCodeMapping() {
        return new CodeMapping(id, name);
    }
}
