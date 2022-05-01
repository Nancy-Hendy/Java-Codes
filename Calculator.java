import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println(" Enter a second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter your chosen operation");
        char value = scanner.next().charAt(0);

        switch(value){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("invalid input");

        }

    }
}
