package TASK_4.EMPLOYEE_MANAGEMENT;

public class Employee {
    private String name;
    private String mobileNumber;
    private String emailId;
    private int age;
    private int empId;
    private double salary;
    private String designation;

    public int getEmpId() {
        return empId;
    }

    public String getDesignation() {
        return designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return name + ","+ emailId +", " + mobileNumber + ", " + emailId + ", " + age + ", " + salary + " ," + designation  ;
    }

    public Employee() {
    }

    public Employee(int empId,String name, String mobileNumber, String emailId, int age, double salary ,String designation) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.empId = empId;
    }
}
