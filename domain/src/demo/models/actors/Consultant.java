package demo.models.actors;

public class Consultant extends Employee {
    public Consultant(String name, Long salary) {
        super(name, salary);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Consultant         |       ");
        builder.append(name);
        builder.append("     |  ");
        builder.append(salary);
        builder.append(" euro  |");

        return builder.toString();
    }
}
