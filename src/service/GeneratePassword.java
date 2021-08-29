package service;
import model.Department;
import model.Employee;

import java.util.Random;

public class GeneratePassword {
    String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String specialCharacters = "!@#$%^&*_=+-/.?<>)";
    String values = capitalLetters + smallLetters + numbers + specialCharacters;

    public String generatePassword() {
        Random random =new Random();
       char password[] = new char[8];
        for(int i=0;i<password.length;i++) {
           password[i] = values.charAt(random.nextInt(values.length()));

        }
        String str = new String(password);
        return str;
    }
}
