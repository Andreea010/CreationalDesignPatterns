package demo.models.actors;

public abstract class Employee {
    protected String name;
    protected Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
    }

    public abstract String toString();

}
