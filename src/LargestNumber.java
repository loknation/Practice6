import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            int largest = Math.max(Math.max(num1, num2), num3);

            System.out.println("The largest number is " + largest + ".");
        }catch (Exception e){
            System.out.println("you iditot");
        }
    }
}
