package se.lu.ics.models;

import java.util.ArrayList;

public class Employee {
    private String employeeId;
    private String name;

    // One-to-many unary association "manage"
    private Employee manager;
    private ArrayList<Employee> subordinates;

    // One-to-many binary association "supervise"
    private Department superviseDepartment;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        subordinates = new ArrayList<Employee>();
    }

    public void addSubordinate(Employee employee) {
        this.subordinates.add(employee);
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getSuperviseDepartment() {
        return superviseDepartment;
    }

    public void setSuperviseDepartment(Department superviseDepartment) {
        this.superviseDepartment = superviseDepartment;
    }
}
