package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.mock.CodeMappingMock.*;

public class CodeMappingTest {

    @Test
    public void canCreateCodeMapping() {
        CodeMapping codeMapping = generateCodeMapping();

        assertEquals(id, codeMapping.getId());
        assertEquals(name, codeMapping.getName());
    }
}
