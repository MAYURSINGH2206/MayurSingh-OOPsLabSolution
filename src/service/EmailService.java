package service;
import model.Department;
import model.Employee;
import java.util.Random;

public class EmailService {
    String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String specialCharacters = "!@#$%^&*_=+-/.?<>)";

    String values = capitalLetters + smallLetters + numbers + specialCharacters;
    public String generateEmail(Employee employee, Department department) {
        String email = employee.getFirstName() + employee.getLastName() +'@' + department.getDepartmentName() + ".email.com";
        return email;
    }



}
