import java.io.*;

public class EmployeeBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private int empId;
    private String empName;
    private double salary;

    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public static void main(String[] args) throws Exception {
        EmployeeBean e = new EmployeeBean();
        e.setEmpId(1);
        e.setEmpName("Riya");
        e.setSalary(55000);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(e);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            EmployeeBean r = (EmployeeBean) in.readObject();
            System.out.println(r.getEmpId() + " " + r.getEmpName() + " " + r.getSalary());
        }
    }
}