package se.lu.ics.models;

public class Consultant extends Employee {
    private double hourlyRate;

    public Consultant(String employeeId, String name, double hourlyRate) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double rate) {
        this.hourlyRate = rate;
    }
}
