// NAME - EMAAN MOHSIN
// EB No. - EB25210006022

class Node {
    String country;
    Node next;
    Node prev;

    Node(String val) {
        country = val;
        next = null;
        prev = null;
    }
}

public class Main {

    // Forward Traversal
    public static void forwardTraversal(Node head) {
        Node curr = head;
        System.out.println("NULL <-> ");
        while (curr != null) {
            System.out.println(curr.country + " <-> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Creating Nodes
        Node head    = new Node("PAKISTAN");
        Node second  = new Node("INDIA");
        Node third   = new Node("CHINA");
        Node fourth  = new Node("USA");
        Node fifth   = new Node("UK");

        // Linking Nodes (next and prev)
        head.next    = second;
        second.prev  = head;

        second.next  = third;
        third.prev   = second;

        third.next   = fourth;
        fourth.prev  = third;

        fourth.next  = fifth;
        fifth.prev   = fourth;

        // Display
        System.out.println("Forward Traversal:");
        forwardTraversal(head);
    }
}
