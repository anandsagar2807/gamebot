import java.util.*;

public class gamebot {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! I'm your game chatbot. Choose a game to play:");
        while (true) {
            System.out.println("\n1. Guess the Number\n2. Math Quiz\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: guessTheNumber(); break;
                case 2: mathQuiz(); break;
                case 3: System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid choice! Try again.");


            }
        }


    }

    private static void guessTheNumber() {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess;
        System.out.println("I've picked a number between 1 and 100. Try to guess it!");
        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (guess != number);
    }

    private static void mathQuiz() {
        Random rand = new Random();
        int a = rand.nextInt(10) + 1;
        int b = rand.nextInt(10) + 1;
        System.out.print("What is " + a + " + " + b + "? ");
        int answer = scanner.nextInt();
        if (answer == a + b) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is " + (a + b));
        }
    }
}


