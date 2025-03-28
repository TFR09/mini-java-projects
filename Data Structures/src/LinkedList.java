public class LinkedList {
    private Node head;

    //insert
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        if (index < 1) {
            insertAtStart(data);
            return;
        }

        Node node = new Node();
        node.data = data;

        Node pointer = head;
        int p = 0;

        while ((pointer.next != null) && (p < (index - 1))) {
            pointer = pointer.next;
            p++;
        }
        node.next = pointer.next;
        pointer.next = node;
    }

    public void show() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void delete(int d) {
        Node n = head;
        Node p = n.next;

        if (n.data == d) {
            head = n.next;
        }
        else {
            while (p.data != d && n.next != null) {
                n = n.next;
                if (n.next == null) {
                    break;
                }
                p = n.next;
            }
            n.next = p.next;

        }   
    }

}
