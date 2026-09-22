// variable =  A resuable container for a value 

// PRIMITIVE = simple value stored directly inside in memory (STACK)
// REFERENCE = memory address (Stack) that points to the (HEAPS)

// PRIMITE VS REFERENCE 

// INT         STRING 
// DOUBLE      ARRAY
// CHAR        OBJECT
// BOOLEAN


public class variable{
    public static void main(String[] args){
        int age = 20;
        int year = 2026;

        double price = 12.45;
        double gpa = 8.6;

        char grade = 'A';
        char symbol = '^';

        boolean is_student = true;
        boolean is_admin = false;

        String name = "Aryan";
        String language = "Java";

        System.out.println("The age is " + age);
        System.out.println("The year is " + year);

        System.out.println("The price is " + price);
        System.out.println("The gpa is " + gpa);
        
        System.out.println("The grade is " + grade);
        System.out.println("The symbol is " + symbol);
        
        System.out.println(is_admin);
        System.out.println(is_student);
        
        System.out.println("The name is " + name);
        System.out.println("The language is " + language);



    }
}