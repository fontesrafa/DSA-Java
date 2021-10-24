import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return this.head;
    }

    void addToEnd(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(n);
        }
    }

    void addToStart(int data) {
        Node n = new Node(data);
        n.setNext(head);
        head = n;
    }

    void addAfter(int insertAfter, int data) {
        Node curr = head;

        while (curr != null) {
            if (curr.getData() == insertAfter) {
                Node n = new Node(data);
                n.setNext(curr.getNext());
                curr.setNext(n);
                break;
            }
            curr = curr.getNext();
        }
    }

    Node deleteLast() {
        Node curr = head;
        if (curr == null || curr.getNext() == null) {
            head = null;
            return curr;
        }
        Node nextNode = curr.getNext();
        while (curr.getNext() != null) {
            if (nextNode.getNext() == null) {
                curr.setNext(null);
            }
            curr = nextNode;
            nextNode = nextNode.getNext();
        }
        return curr;
    }

    Node deleteFirst() {
        if (head != null) {
            Node toDelete = head;
            head = head.getNext();
            return toDelete;
        }
        return null;
    }

    Node deleteAfter(int data) {
        Node curr = head;
        Node toDelete = null;
        while (curr != null) {
            if (curr.getData() == data && curr.getNext() != null) {
                toDelete = curr.getNext();
                curr.setNext(toDelete.getNext());
                break;
            }
            curr = curr.getNext();
        }
        return toDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LinkedList)) {
            return false;
        }
        LinkedList linkedList = (LinkedList) o;
        return Objects.equals(head, linkedList.head);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(head);
    }

    @Override
    public String toString() {
        Node curr = head;
        int count = 0;
        String out = "---------------------------------------------------------------------------------------------------------------\n";
        while (curr != null) {
            if (count == 0)
                out = out + "[Head = " + curr.getData() + "] ---> ";
            else
                out = out + "[N" + count + " = " + curr.getData() + "] ---> ";
            if (curr.getNext() == null)
                out = out + "NULL";
            curr = curr.getNext();
            count++;
        }
        out = out
                + "\n--------------------------------------------------------------------------------------------------------------- \n";
        return out;
    }
}
