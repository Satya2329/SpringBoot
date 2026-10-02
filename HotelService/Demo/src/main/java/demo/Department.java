package demo;

public class Department {
    String d_name;
    int salary;

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_name='" + d_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
