public class Application {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Vihanga");
        employee1.setNumberOfDayAttend(25);

        Employee employee2 = new Employee();
        employee2.setName("Nadun");
        employee2.setNumberOfDayAttend(23);

        SalaryCalculate salaryCalculate1 = new SalaryCalculate(employee1);
        salaryCalculate1.start();

        SalaryCalculate salaryCalculate2 = new SalaryCalculate(employee2);
        salaryCalculate2.start();
    }
}
