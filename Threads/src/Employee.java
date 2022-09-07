public class Employee {

    private String name;
    private double basicSalary;
    private int numberOfDayAttend;
    private double dailySalary;

    public Employee() {
        this.name = "Default";
        this.numberOfDayAttend = 0;
        this.basicSalary = 40000;
        this.dailySalary = 1500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = dailySalary;
    }

    public int getNumberOfDayAttend() {
        return numberOfDayAttend;
    }

    public void setNumberOfDayAttend(int numberOfDayAttend) {
        this.numberOfDayAttend = numberOfDayAttend;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

}
