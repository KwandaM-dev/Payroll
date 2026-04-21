package za.ac.cput.entity;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String email;
    private String address;
    private String gender;
    private String occupation;
    private String department;
    private double salary;


    private Employee(){

    }

    public int getEmployeeId(){
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

    public void equals(){

    }

    public static class Builder{
        private int employeeId;
        private String employeeName;
        private String email;
        private String address;
        private String gender;
        private String occupation;
        private String department;
        private double salary;

        public Builder setEmployeeId(int employeeId){
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

        public Employee.Builder copy(){
            Employee employee = new Employee();
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
