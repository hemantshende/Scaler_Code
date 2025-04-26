package AdvanceDSA_3.LinkedList_Introduction;

public class LinkedList {
    Node head;
//1. to add element in list
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void addFirst(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        printList();
    }

    public void addAtIndex(int val,int index){
        Node nn=new Node(val);
        //index==0
        if(index==0){
            addFirst(val);
        }
        int count=0;
        Node temp=head;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index " + index + " is out of bounds.");
            return;
        }
        nn.next = temp.next;
        temp.next = nn;
        printList();
    }

    public void deleteFirst(){
        head=head.next;
        printList();
    }

    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        printList();
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (index == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;
        int count = 0;

        // Traverse to the node just before the one you want to delete
        while (temp != null && temp.next != null) {
            if (count == index - 1) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Index " + index + " is out of bounds.");

    }

    //to get kth element from list
    public void get_Kth_element(int k){
        Node current=head;
        for(int i=0; i<k;i++){
            current=current.next;
        }
        System.out.println(current.val);
    }

//Search in linkedList
    public void search_in_list(int val){
        Node temp=head;
        while(temp.next!=null){
            if(temp.val==val){
                System.out.println("true");
                return;
            }
            temp=temp.next;
        }
        System.out.println("flase");
    }

    //reverse list
    public void reverse(){
        Node prev=null;
        Node temp=head;
        Node next=null;

        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
        printList();
    }

    //print list
    public void printList(){
        Node current=head;
        while (current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}
