package demo;

public class Emp {
    int e_id;
    String e_name;
    Department d;

    public Department getD() {
        return d;
    }

    public void setD(Department d) {
        this.d = d;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "d=" + d +
                ", e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                '}';
    }
}
