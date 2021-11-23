package demo.models.actors;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, Long salary) {
        super(name, salary);
    }

    @Override
    public void add(Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Manager            |       ");
        builder.append(name);
        builder.append("      |  ");
        builder.append(salary);
        builder.append(" euro  |");

        return builder.toString();
    }
}
