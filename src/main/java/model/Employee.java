package model;

public class Employee {
    private int id;
    private String employee_name;
    private int employee_salary;
    private int employee_age;

    private String profile_image;

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }


    public int getEmployee_age() {
        return employee_age;
    }

    public int getEmployeeSalary() {
        return employee_salary;
    }

    public String getEmployeeName() {
        return  employee_name;
    }
}