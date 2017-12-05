package th.ac.kmitl.science.comsci.example.models;

public class CitySubDivision {

    private int Id;
    private String Name;

    public CitySubDivision(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
