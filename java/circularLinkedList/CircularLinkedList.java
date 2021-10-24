public class CircularLinkedList {
    Node last;

    public CircularLinkedList() {
        this.last = null;
    }

    public CircularLinkedList(Node last) {
        this.last = last;
        if (this.last != null) {
            this.last.setNext(last);
        }
    }

    public Node getLast() {
        return this.last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void addToEnd(int data) {
        Node n = new Node(data);
        if (last == null) {
            last = n;
            n.setNext(last);
        } else {
            n.setNext(last.getNext());
            last.setNext(n);
            last = n;
        }
    }

    @Override
    public String toString() {
        Node curr = last.getNext();
        int count = 0;
        String out = "---------------------------------------------------------------------------------------------------------------\n";
        if (curr == last) {
            out = out + "[LAST = " + curr.getData() + "]";
        }
        while (curr != last) {
            out = out + "[N" + count + " = " + curr.getData() + "] ---> ";
            curr = curr.getNext();
            if (curr == last)
                out = out + "[LAST = " + curr.getData() + "]";
            count++;
        }
        out = out
                + "\n--------------------------------------------------------------------------------------------------------------- \n";
        return out;
    }

}
