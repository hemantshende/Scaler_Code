package AdvanceDSA_3.LinkedList_Introduction;

public class Client {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        //add last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.printList();

        list.get_Kth_element(0);
        list.search_in_list(10);

        list.addFirst(5);
        list.addAtIndex(25,2);

        list.deleteFirst();
        list.deleteLast();
        list.deleteAtIndex(3);
        list.printList();
        list.reverse();
    }
}
