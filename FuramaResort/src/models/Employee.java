package models;

public class Employee extends Person {
    private String employeeCode;
    private String employeePosition;
    private float employeeSalary;
    private final String[] positionArray = {"Le tan", "Phuc vu", "Giam sat", "Quan ly", "Giam doc"};
    private final String[] degreeArray = {"Trung hoc co so", "Trung hoc pho thong", "Cao dang", "Dai hoc", "Ra truong"};

    public Employee() {

    }

    public Employee(String employeeCode, String employeePosition, float employeeSalary) {
        this.employeeCode = employeeCode;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public Employee(String personName, int personAge, int dayOfBirth, String sex, String personTelephone, String employeeCode, String employeePosition, float employeeSalary) {
        super(personName, personAge, dayOfBirth, sex, personTelephone);
        this.employeeCode = employeeCode;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee Code : " + employeeCode
                + "Employee Position :" + employeePosition
                + "Employee Salary :" + employeeSalary;
    }
}
