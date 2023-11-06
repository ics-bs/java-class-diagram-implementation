package se.lu.ics.models;

public class Department {
    private String name;
    private int budget;

    public Department() {}

    public Department(String name, int budget) {
        this.name = name;
        this.budget = budget;
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
    
}
