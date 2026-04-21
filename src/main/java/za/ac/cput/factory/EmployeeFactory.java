package za.ac.cput.factory;

import jakarta.mail.Header;
import za.ac.cput.entity.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(
            String employeeId,
            String employeeName,
            String email,
            String address,
            String gender,
            String occupation,
            String department,
            double salary

    ){
        if(Helper.isNullOrEmpty(employeeName) ||  Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(address)
        || Helper.isNullOrEmpty(gender) || Helper.isNullOrEmpty(occupation) ||  Helper.isNullOrEmpty(department)){
            return null;
        }

        if(!Helper.salary(salary)){
            return null;
        }

        if(Helper.isValidEmail(email)){
            return null;
        }

        if(!Helper.isValidEmployeeId(employeeId)){
            return null;
        }

        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setEmployeeName(employeeName)
                .setEmail(email)
                .setAddress(address)
                .setGender(gender)
                .setDepartment(department)
                .setOccupation(occupation)
                .setSalary(salary)
                .build();
    }
}
