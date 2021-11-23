package demo.models.structures.store;

public class Department extends Store {

    private String name, staff;
    private int IDNumber;

    public Department(String name, int IDNumber, String staff, DescriptionAPI descriptionAPI) {
        super(descriptionAPI);
        this.name = name;
        this.IDNumber = IDNumber;
        this.staff = staff;
    }

    public void description() {
        descriptionAPI.description(name, IDNumber, staff);
    }
}
