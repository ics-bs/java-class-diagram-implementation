package se.lu.ics.models;

import java.util.ArrayList;

public class Department {
    private String name;
    private int budget;
    
    // One-to-many binary association
    private ArrayList<Employee> supervisors;

    public Department() {}

    public Department(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public void addSupervisor(Employee employee) {
        this.supervisors.add(employee);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ArrayList<Employee> getSupervisors() {
        return supervisors;
    }
}
