package za.ac.cput.entity;

import java.util.Objects;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String email;
    private String address;
    private String gender;
    private String occupation;
    private String department;
    private double salary;


    private Employee(){

    }

    private Employee(Builder builder){
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.email = builder.email;
        this.address = builder.address;
        this.gender = builder.gender;
        this.occupation = builder.occupation;
        this.department = builder.department;
        this.salary = builder.salary;

    }


    public String getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }

    public String getGender(){
        return gender;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)  return true;
        if(!(o instanceof Employee))  return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    public static class Builder{
        private String employeeId;
        private String employeeName;
        private String email;
        private String address;
        private String gender;
        private String occupation;
        private String department;
        private double salary;

        public Builder setEmployeeId(String employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public Builder setEmployeeName(String employeeName){
            this.employeeName = employeeName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public Builder setOccupation(String occupation){
            this.occupation = occupation;
            return this;
        }

        public Builder setDepartment(String department){
            this.department = department;
            return this;
        }

        public Builder setSalary(double salary){
            this.salary = salary;
            return this;
        }

        public Employee.Builder copy(Employee employee){
            employee.employeeId = employeeId;
            employee.employeeName = employeeName;
            employee.email = email;
            employee.address = address;
            employee.gender = gender;
            employee.occupation = occupation;
            employee.department = department;
            employee.salary = salary;
            return this;
        }

        public Employee build(){
            return new Employee();
        }

    }



}
