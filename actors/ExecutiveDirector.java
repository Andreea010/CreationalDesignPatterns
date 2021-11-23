package demo.models.actors;

import java.util.ArrayList;
import java.util.List;

public class ExecutiveDirector extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public ExecutiveDirector(String name, Long salary) {
        super(name, salary);
    }


    @Override
    public void add(Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Executive Director |    ");
        builder.append(name);
        builder.append("   |  ");
        builder.append(salary);
        builder.append(" euro |");

        return builder.toString();
    }
}
