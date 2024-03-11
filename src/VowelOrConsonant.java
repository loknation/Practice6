import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter a single character: ");
            char input = scanner.next().charAt(0);

            if (Character.isLetter(input)) {
                input = Character.toUpperCase(input);
                if (input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Not a valid letter.");
            }
        }catch (Exception e){
            System.out.println("you idiot");
        }
    }
}
