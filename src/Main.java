import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1 - Only numbers");
        System.out.println("2 - Only letters");
        System.out.println("3 - Numbers and letters");
        System.out.println("4 - Numbers, letters, and symbols");
        System.out.println("Choose one:");
        int choice = scanner.nextInt();

        System.out.println("Please enter the size of the password: ");
        int size = scanner.nextInt();

        StringBuilder password = new StringBuilder();

        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                password.append(random.nextInt(10));
            }
        }
        else if (choice == 2) {
            System.out.println("1 - Only uppercase letters");
            System.out.println("2 - Only lowercase letters");
            System.out.println("3 - Uppercase and lowercase letters");
            System.out.println("Choose one:");
            int choice2 = scanner.nextInt();

            for (int i = 0; i < size; i++) {
                if (choice2 == 1) {
                    password.append((char) (random.nextInt(26) + 'A'));
                } else if (choice2 == 2) {
                    password.append((char) (random.nextInt(26) + 'a'));
                } else {
                    if (random.nextBoolean()) {
                        password.append((char) (random.nextInt(26) + 'A'));
                    } else {
                        password.append((char) (random.nextInt(26) + 'a'));
                    }
                }
            }
        }
        else if (choice == 3) {
            for (int i = 0; i < size; i++) {
                int randomChoice = random.nextInt(3);
                if (randomChoice == 0) {
                    password.append((char) (random.nextInt(26) + 'A'));
                } else if (randomChoice == 1) {
                    password.append((char) (random.nextInt(26) + 'a'));
                } else {
                    password.append(random.nextInt(10));
                }
            }
        }
        else if (choice == 4) {
            String symbols = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
            for (int i = 0; i < size; i++) {
                int randomChoice = random.nextInt(4);
                if (randomChoice == 0) {
                    password.append((char) (random.nextInt(26) + 'A'));
                } else if (randomChoice == 1) {
                    password.append((char) (random.nextInt(26) + 'a'));
                } else if (randomChoice == 2) {
                    password.append(random.nextInt(10));
                } else {
                    password.append(symbols.charAt(random.nextInt(symbols.length())));
                }
            }
        }
        else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Your password: " + password);
    }
}