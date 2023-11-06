package se.lu.ics.models;

public class RegularEmployee extends Employee {
    private String title;
    private double salary;

    // ctor params inc. inherited params empid and name
    public RegularEmployee(String employeeId, String name, String title, double salary) {
        super(employeeId, name);
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
