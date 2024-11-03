public class Employee {
    private String id;
    private String name;
    private int salary;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    Employee (String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee() {

    }

    public int getAnnualSalary() {
        int annualSalary = getSalary() * 12;
        return annualSalary;
    }

    public double raisedSalary(double percent) {
        double raise = getSalary() * (percent / 100);
        double newSalary = getSalary() + raise;
        return newSalary;
    }

    public String toString() {

        return ("Employee name: " + getName() +
                "\nEmplyee id: " + getId() +
                "\nEmployee Salary: " + getSalary() +
                "\nEmployee annual salary: " + getAnnualSalary());
    }

}
