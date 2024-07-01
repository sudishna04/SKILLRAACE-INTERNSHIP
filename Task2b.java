import java.util.Scanner;

class CountFours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from the candy group: ");
        String number = scanner.nextLine();
        scanner.close();
        
        int countFours = 0;
        
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4') {
                countFours++;
            }
        }
        
        System.out.println(countFours);
    }
}
