// NAME - EMAAN MOHSIN 
// EB No. - EB25210006022

class Node {
    String grade;
    Node next;
    Node prev;

    Node(String val) {
        grade = val;
        next = null;
        prev = null;
    }
}

public class Main {

    // Backward Traversal
    public static void backwardTraversal(Node tail) {
        Node curr = tail;
        while (curr != null) {
            System.out.println(curr.grade);
            curr = curr.prev;
        }
    }

    public static void main(String[] args) {

        // Creating Nodes
        Node head   = new Node("ALI   - A+");
        Node second = new Node("SARA  - B+");
        Node third  = new Node("USMAN - A");
        Node fourth = new Node("NIDA  - B");
        Node tail   = new Node("BILAL - C+");

        // Linking Nodes
        head.next    = second;
        second.prev  = head;

        second.next  = third;
        third.prev   = second;

        third.next   = fourth;
        fourth.prev  = third;

        fourth.next  = tail;
        tail.prev    = fourth;

        // Forward Display
        System.out.println("=============================");
        System.out.println("      STUDENT GRADE LIST     ");
        System.out.println("=============================");
        System.out.println("Forward Order:");
        System.out.println("-----------------------------");
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.grade);
            curr = curr.next;
        }

        // Backward Display
        System.out.println("-----------------------------");
        System.out.println("Backward Order:");
        System.out.println("-----------------------------");
        backwardTraversal(tail);
        System.out.println("=============================");
    }
}
