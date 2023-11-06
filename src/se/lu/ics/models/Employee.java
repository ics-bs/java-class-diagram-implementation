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

    /*
     * Many-to-many binary association "mentor"
     * An employee can be a mentor at several departments
     */
    private ArrayList<Department> mentorDepartments;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        subordinates = new ArrayList<Employee>();
        mentorDepartments = new ArrayList<Department>();
    }

    public void addSubordinate(Employee employee) {
        this.subordinates.add(employee);
    }

    public void addMentorDepartment(Department department) {
        this.mentorDepartments.add(department);
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

    public ArrayList<Department> getMentorDepartments() {
        return mentorDepartments;
    }
    
}
