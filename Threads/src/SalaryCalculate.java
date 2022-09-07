public class SalaryCalculate extends Thread {

    private Employee employee;

    public SalaryCalculate(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 12; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            calculateSalary(i);
        }
    }

    public void calculateSalary(int month) {
        double finalSalary = employee.getBasicSalary() + (employee.getDailySalary() * employee.getNumberOfDayAttend());
        System.out.println( employee.getName() + " 's month "+ month +" Salary is : Rs : "+ finalSalary);
    }


}
