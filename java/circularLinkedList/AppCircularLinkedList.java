public class AppCircularLinkedList {

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.addToEnd(9);
        list.addToEnd(10);
        list.addToEnd(13);
        list.addToEnd(11);
        list.addToEnd(20);
        System.out.println(list);

        System.out.println(list.last.getNext());

    }

}
