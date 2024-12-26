import java.util.Scanner;

public class BMIRandomNumber {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of test cases: ");
        int testCases = scanner.nextInt();  

        
        for (int i = 1; i <= testCases; i++) {
            System.out.println("Test Case " + i + ":");

            
            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();

           
            System.out.print("Enter your height (feet): ");
            int feet = scanner.nextInt();

            System.out.print("Enter your height (inches): ");
            int inches = scanner.nextInt();

            
            double heightInMeters = (feet * 0.3048) + (inches * 0.0254); //conversion

           
            double bmi = weight / (heightInMeters * heightInMeters);    //find out bmi

           
            int randomNumber = (int) ((bmi * 1000000) % 100); // random nbr generate

            
            System.out.println("Your BMI: " + bmi);
            System.out.println("Generated Random Number: " + randomNumber);
            System.out.println();
        }

       
        scanner.close();
    }
}
