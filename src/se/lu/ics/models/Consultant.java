package se.lu.ics.models;

public class Consultant extends Employee {
    private double hourlyRate;

    public Consultant(String employeeId, String name, double hourlyRate) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
    }

    /*
     * Consultants get paid by the hour
     * The payment is calculated by multiplying 
     * the hourly rate with the total hours worked
     */
    @Override
    public double calculatePayment() {
        int totalHours = 0;

        for(WorkRecord record : this.getWorkRecords()) {
            totalHours += record.getHours();
        }

        return totalHours * this.hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double rate) {
        this.hourlyRate = rate;
    }
}
