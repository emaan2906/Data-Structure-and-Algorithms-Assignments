import java.util.Scanner;
import java.util.LinkedList;

public class Deletion {
    static LinkedList<String> cities = new LinkedList<String>();
    static Scanner sc = new Scanner(System.in); // Single shared Scanner

    public static void displayMenu() {
        System.out.println("\n--------MENU---------");
        System.out.println("1. Delete from beginning");
        System.out.println("2. Delete from end");
        System.out.println("3. Delete at specific position");
        System.out.println("4. Delete after a given node");
        System.out.println("5. Delete before a given node");
        System.out.println("---------------------");
    }

    public static void LIST() {
        cities.add("KARACHI");
        cities.add("LAHORE");
        cities.add("ISLAMABAD");
        cities.add("PESHAWAR");
        cities.add("QUETTA");
        System.out.println("Initial List: " + cities);
    }

    // 1. Delete from beginning
    public static void REMOVEFIRST() {
        if (!cities.isEmpty()) {
            System.out.println("Removed: " + cities.getFirst());
            cities.removeFirst();
        } else {
            System.out.println("List is empty!");
        }
        System.out.println("Updated List: " + cities);
    }

    // 2. Delete from end
    public static void REMOVELAST() {
        if (!cities.isEmpty()) {
            System.out.println("Removed: " + cities.getLast());
            cities.removeLast();
        } else {
            System.out.println("List is empty!");
        }
        System.out.println("Updated List: " + cities);
    }

    // 3. Delete at specific position
    public static void SPECIFIC_POSITION() {
        System.out.print("Enter position to delete (0-based): ");
        int pos = sc.nextInt();
        if (pos >= 0 && pos < cities.size()) {
            System.out.println("Removed: " + cities.get(pos));
            cities.remove(pos);
        } else {
            System.out.println("Invalid position!");
        }
        System.out.println("Updated List: " + cities);
    }

    // 4. Delete after a given node
    public static void AFTERNODE() {
        int index = cities.indexOf("LAHORE");
        if (index != -1 && index + 1 < cities.size()) {
            System.out.println("Removed after LAHORE: " + cities.get(index + 1));
            cities.remove(index + 1);
        } else {
            System.out.println("Node not found or no element after it!");
        }
        System.out.println("Updated List: " + cities);
    }

    // 5. Delete before a given node
    public static void BEFORENODE() {
        int index = cities.indexOf("PESHAWAR");
        if (index > 0) {
            System.out.println("Removed before PESHAWAR: " + cities.get(index - 1));
            cities.remove(index - 1);
        } else {
            System.out.println("Node not found or no element before it!");
        }
        System.out.println("Updated List: " + cities);
    }

    public static void main(String[] args) {
        LIST();

        int choice;
        String cont;

        do {
            displayMenu();
            System.out.print("Select from the menu: ");
            choice = sc.nextInt();
            sc.nextLine(); // Flush leftover newline

            switch (choice) {
                case 1:
                    REMOVEFIRST();
                    break;
                case 2:
                    REMOVELAST();
                    break;
                case 3:
                    SPECIFIC_POSITION();
                    break;
                case 4:
                    AFTERNODE();
                    break;
                case 5:
                    BEFORENODE();
                    break;
                default:
                    System.out.println("Invalid entry!");
            }

            System.out.print("Do you want to continue (Y/N): ");
            cont = sc.nextLine();

        } while (cont.equalsIgnoreCase("y"));

        System.out.println("\nFinal List: " + cities);
        sc.close();
    }
}
