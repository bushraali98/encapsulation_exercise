public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("23145", "Ahmed", 65000);
        Employee employee2 = new Employee();
        employee2.setId("22314");
        employee2.setName("Khalid");
        employee2.setSalary(9500);


        System.out.println("First employee" +
                "\nID: " + employee1.getId() +
                "\nName: " + employee1.getName() +
                "\nSalary: " + employee1.getSalary() +
                "\nAnnual salary: " + employee1.getAnnualSalary() +
                "\nRaised salary: " + employee1.raisedSalary(4)
        );

        System.out.println();
        System.out.println("Second employee" +
                "\nID: " + employee2.getId() +
                "\nname: " + employee2.getName() +
                "\nsalary: " + employee2.getSalary() +
                "\nAnnual salary: " + employee2.getAnnualSalary());

        System.out.println(employee1.toString());
        System.out.println();
        System.out.println(employee2.toString());

    }
}