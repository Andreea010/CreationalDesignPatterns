package demo.models.structures.store;

public class FirstDepartment implements DescriptionAPI {

    public void description(String name, int IDNumber, String staff) {
        System.out.println("|  " + name + "  | " + "id." + IDNumber + " |       " + staff + "      |");
    }
}
