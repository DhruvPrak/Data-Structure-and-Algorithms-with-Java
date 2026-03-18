import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateLL {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateLL list = new CreateLL();

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }

        System.out.print("Created Linked List: ");
        list.display();

        sc.close();
    }
}
