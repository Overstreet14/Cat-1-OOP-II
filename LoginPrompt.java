
import java.util.Scanner;

public class LoginPrompt
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        
        
        String correctUsername = "Amerix"; // prompting user to enter username
    
        String correctPassword = "BRICS";
        
        
        String usernameInput;
        String passwordInput;
        
       
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter username: ");
            usernameInput = scanner.nextLine();
            
            System.out.print("Enter password: ");
            passwordInput = scanner.nextLine();
            
            if (usernameInput.equals(correctUsername) && passwordInput.equals(correctPassword)) 
            {
                System.out.println("Login successful!");
                break;
            } else 
            {
                System.out.println("Incorrect username or password. Please try again.");
                if (attempt == 3) 
                {
                    System.out.println("You have exceeded the maximum number of attempts.");
                }
            }
        }
        
        scanner.close();
    }
    
    
    private static String readPasswordInput(Scanner scanner) {
        String password = "";
        System.out.print("\b"); 
        while (true) {
            char c = System.console().readPassword()[0];
            if (c == '\r' || c == '\n') {
                break;
            }
            System.out.print("*");
            password += c;
        }
        System.out.println();
        return password;
    }
}
