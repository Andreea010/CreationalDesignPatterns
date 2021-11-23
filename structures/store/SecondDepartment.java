package demo.models.structures.store;

public class SecondDepartment implements DescriptionAPI {

    public void description(String name, int IDNumber, String staff) {
        System.out.println("|  " + name + "  | " + "id." + IDNumber + " | " + staff + " |");
    }
}
