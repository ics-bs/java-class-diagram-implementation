package se.lu.ics.models;

public class WorkRecord {
    private Employee employee;
    private Department department;
    private int hours;

    public WorkRecord(Employee employee, Department department, int hours) {
        this.employee = employee;
        this.department = department;
        this.hours = hours;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public Department getDepartment() {
        return this.department;
    }

    public int getHours() {
        return this.hours;
    }
    
}
