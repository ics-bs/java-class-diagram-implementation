package se.lu.ics.models;

import java.util.ArrayList;

public class Department {
    private String name;
    private int budget;
    
    // One-to-many binary association "supervise"
    private ArrayList<Employee> supervisors;

    /*
     * Many-to-many binary association "mentor"
     * A department can have several employees as mentors
     */
    private ArrayList<Employee> mentors;

    public Department() {}

    public Department(String name, int budget) {
        this.name = name;
        this.budget = budget;
        supervisors = new ArrayList<Employee>();
        mentors = new ArrayList<Employee>();
    }

    public void addSupervisor(Employee employee) {
        this.supervisors.add(employee);
    }

    public void addMentor(Employee employee) {
        this.mentors.add(employee);
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

    public ArrayList<Employee> getMentors() {
        return mentors;
    }
}
