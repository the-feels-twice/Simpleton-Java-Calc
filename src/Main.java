import java.util.Scanner;

class Main {
    static void main() {
        Scanner input = new Scanner(System.in);

        int choice = -5;
        boolean valid = false;

        double numberOne;
        double numberTwo;

        System.out.print("---------- Select ----------\n");
        System.out.print("1. Addition\n");
        System.out.print("2. Subtraction\n");
        System.out.print("3. Multiplication\n");
        System.out.print("4. Division\n");
        System.out.print("5. Power\n");
        System.out.print("6. Exit\n\n");

        while (!valid) {
            System.out.print("Choice: ");
            String line = input.nextLine();

            try {
                choice = Integer.parseInt(line);

                if (choice < 1 || choice > 6) {
                    System.out.println("Enter a number between 1 and 6.\n");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number between 1 and 6.\n");
            }
        }

        switch (choice) {
            case 1:
                System.out.print("First number: ");
                numberOne = Double.parseDouble(input.nextLine());
                System.out.print("Second number: ");
                numberTwo = Double.parseDouble(input.nextLine());
                System.out.println("\nResult: " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.print("First number: ");
                numberOne = Double.parseDouble(input.nextLine());
                System.out.print("Second number: ");
                numberTwo = Double.parseDouble(input.nextLine());
                System.out.println("\nResult: " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.print("First number: ");
                numberOne = Double.parseDouble(input.nextLine());
                System.out.print("Second number: ");
                numberTwo = Double.parseDouble(input.nextLine());
                System.out.println("\nResult: " + (numberOne * numberTwo));
                break;
            case 4:
                System.out.print("First number: ");
                numberOne = Double.parseDouble(input.nextLine());
                System.out.print("Second number: ");
                numberTwo = Double.parseDouble(input.nextLine());
                System.out.println("\nResult: " + (numberOne / numberTwo));
                break;
            case 5:
                System.out.print("First number: ");
                numberOne = Double.parseDouble(input.nextLine());
                System.out.print("Power: ");
                numberTwo = Double.parseDouble(input.nextLine());
                System.out.println("\nResult: " + Math.pow(numberOne, numberTwo));
                break;
            case 6:
                System.out.println("\nLater loser");
                System.exit(0);
            default:
                System.out.println("\nInvalid operation");
                System.exit(100);
        }
    }
}