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

    /*
     * Managers get 30% extra salary
     * Developers get 10% extra salary
     * Other employees get their standard salary
     */
    @Override
    public double calculatePayment() {
        if(this.title.equals("manager")) {
            return this.salary * 1.3;
        } else if(this.title.equals("developer")) {
            return this.salary * 1.1;
        } else {
            return this.salary;
        }
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
