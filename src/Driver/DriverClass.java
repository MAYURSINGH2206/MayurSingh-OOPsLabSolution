package Driver;
import model.Employee;
import model.Department;
import service.EmailService;
import java.net.SocketPermission;
import java.util.Scanner;
import service.GeneratePassword;

public class DriverClass {

    public static void main(String[] args) {
        Employee employee = new Employee("Mayur" , "Singh");
        System.out.println(" Select your Department: ");
        System.out.println("1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");

        Scanner sc = new Scanner(System.in);

        int choice =sc.nextInt();

        EmailService emailService = new EmailService();
        GeneratePassword generatePassword = new GeneratePassword();

        switch (choice){
            case 1:
                Department department =new Department("Technical");
                String email=emailService.generateEmail(employee, department);
                String password =generatePassword.generatePassword();
                System.out.println(email + " & " + password);
                break;

            case 2:
                Department department1 =new Department("Admin");
                String email1=emailService.generateEmail(employee, department1);
                String password1 =generatePassword.generatePassword();
                System.out.println(email1 + " & " + password1);
                break;

            case 3:
                Department department2 =new Department("Human Resource");
                String email3=emailService.generateEmail(employee, department2);
                String password3 =generatePassword.generatePassword();
                System.out.println(email3 + " & " + password3);
                break;

            case 4:
                Department department3 =new Department("Legal");
                String email4=emailService.generateEmail(employee,department3);
                String password4 =generatePassword.generatePassword();
                System.out.println(email4 + " & " + password4);
                break;
        }

    }

}