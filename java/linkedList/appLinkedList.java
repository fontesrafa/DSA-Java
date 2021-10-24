public class appLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addToEnd(8);
        list.addToEnd(10);
        list.addToEnd(1);
        list.addToEnd(20);
        list.addToEnd(15);
        list.addToEnd(12);
        System.out.println("Initial list: \n");
        System.out.println(list);

        list.addAfter(1, 2);
        System.out.println("Added 2 after 1: \n");
        System.out.println(list);

        list.addToEnd(89);
        System.out.println("Added 89 at the end: \n");
        System.out.println(list);

        list.addToStart(95);
        System.out.println("Added 95 at the start: \n");
        System.out.println(list);

        list.deleteAfter(15);
        System.out.println("Deleted node after : \n");
        System.out.println(list);

        list.deleteFirst();
        System.out.println("Deleted first node: \n");
        System.out.println(list);

        list.deleteLast();
        System.out.println("Deleted last node: \n");
        System.out.println(list);

    }

}
