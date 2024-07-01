import java.util.Scanner;

class RideEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();
        scanner.close();
        
        if (age < 15 || age > 60) {
            System.out.println("Not Allowed");
        } else {
            System.out.println("Allowed");
        }
    }
}
