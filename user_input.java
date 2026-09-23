import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false) ");
        boolean is_student = scanner.nextBoolean();

        System.out.println("Hello "+ name );
        System.out.println("Your age is  "+ age );
        System.out.println("Your GPA is  "+ gpa );
        // System.out.println("Are you student: "+ is_student );

        if(is_student){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
    
}
