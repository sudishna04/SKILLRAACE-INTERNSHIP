import java.util.Scanner;

class SumOfOddAndEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long number: ");
        String number = scanner.nextLine();
        scanner.close();
        
        int sumOdd = 0;
        int sumEven = 0;
        
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }
        
        System.out.println(sumOdd + " " + sumEven);
    }
}
