public class CommitCafe {

    private static String barista = "Connor"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String title = "barista";

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        System.out.println("Order ready!");
        // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.println("The " + title + " brewed a nice " + drink);
    }

    public static void printSummary() {
        System.out.println("Summary: " + cups + " cups were brewed by " + barista + " the " + title + " today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}