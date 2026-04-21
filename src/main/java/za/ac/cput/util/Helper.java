package za.ac.cput.util;

import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;

public class Helper {

    public static boolean isNullOrEmpty(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        return true;
    }

    public static boolean isValidEmployeeId(String employeeId) {
        // [A-Z]{3} matches 3 uppercase letters, then / followed by 3 digits, etc.
        String regex = "^[A-Z]{3}/\\d{3}/\\d{4}$";
        return employeeId.matches(regex);
    }


    public static boolean isValidEmail(String email) {
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
            return true;
        } catch (AddressException ex) {
            return false;
        }
    }

    public static boolean salary(double salary){
        if(salary == 0.00f){
            return false;
        }
        return true;
    }





}
