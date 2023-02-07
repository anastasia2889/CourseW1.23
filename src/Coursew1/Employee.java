package Coursew1;

public class Employee {
    private String fio;
    private int department;
    private double salary;
    static int counter;
    private int id;

    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = counter++;

    }

    public String getFio() {
        return this.fio;

    }

    public int getDepartment() {

        return this.department;
    }

    public double getSalary() {

        return this.salary;
    }

    public int getId() {

        return this.id;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

