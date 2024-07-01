import java.util.Scanner;
class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean exit = false;

        System.out.println("Hello! I'm a simple chatbot. How can I help you today?");
        
        while (!exit) {
            System.out.print("You: ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "hi":
                case "hello":
                    System.out.println("Chatbot: Hello! How are you?");
                    break;
                case "how are you":
                    System.out.println("Chatbot: I'm just a program, so I don't have feelings, but thanks for asking!");
                    break;
                case "what's your name":
                case "what is your name":
                    System.out.println("Chatbot: I'm your friendly chatbot.");
                    break;
                case "exit":
                case "bye":
                    System.out.println("Chatbot: Goodbye! Have a great day!");
                    exit = true;
                    break;
                default:
                    System.out.println("Chatbot: I'm sorry, I don't understand that.");
                    break;
            }
        }

        scanner.close();
    }
}
