import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        double height = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        area = width * height;

        System.out.println("Area of rectangle is: "+ area );


        scanner.close();
    }
    
}
