import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatbot {

    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hello", "Hi there! How can I help you today?");
        responses.put("how are you", "I'm just a program, but I'm doing great! How can I assist you?");
        responses.put("what is your name", "I am a simple chatbot. You can call me Chatbot.");
        responses.put("bye", "Goodbye! Have a great day!");
        // Add more responses as needed
    }

    public static String getResponse(String input) {
        // Normalize input to lower case to make it case-insensitive
        String normalizedInput = input.trim().toLowerCase();
        // Find response based on the input
        return responses.getOrDefault(normalizedInput, "Sorry, I didn't understand that.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type 'bye' to exit.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            
            if (userInput.trim().equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            
            String response = getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }
}