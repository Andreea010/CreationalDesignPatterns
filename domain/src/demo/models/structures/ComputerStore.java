package demo.models.structures;

import demo.models.actors.singleton.Staff;
import demo.models.specs.Computer;
import java.util.ArrayList;
import java.util.List;

public class ComputerStore {

    private String name = "Computer Store";
    private String address = "Computer store address";
    private final List<Computer> ComputerList = new ArrayList<>();
    private final List<Staff> StaffList = new ArrayList<>();


    @Override
    public String toString() {
        return "Computer Store: " + "\n" +
                "Name = " + name + "\n" +
                "Address = " + address + "\n" +
                "Computer Stock = " + ComputerList + "\n" +
                "Staff = " + StaffList;
    }
}


