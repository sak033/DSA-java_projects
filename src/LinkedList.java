public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
        this.size=0;
    }
    class Node{
        //variables
        String data;
        Node next;

        //constructor
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add- first position
    public void addFirst(String data){
        //check if there any data present in head i.e. in first position
        Node newNode= new Node(data);
        if(head==null){
            //create a node and make it head
            head= newNode;
            return;
        }
        //if head is not Null
        newNode.next=head;    // new node ka next head ki taraf point karega
        head= newNode;        //aur head ki value newNode bn jayegi
    }
    //Add- last position
    //make new node first and check head is empty or not
    public void addLast(String data){
        //make new node
        Node newNode= new Node(data);
        if(head==null){
            //create a node and make it head
            head= newNode;
            return;
        }

        //travers the likned list
        Node currNode=head;
        while(currNode.next !=null){    //jab tak current node ka next null nahi hop jata
            currNode=currNode.next;    //next node ko current node banaoo
        }
        //agar current node ka next null ho jaye
        currNode.next=newNode;  //to current node ke next ko newNode bana do
    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){    //jab tak current node ka next null nahi hop jata
            System.out.print(currNode.data+"->");
            currNode=currNode.next;    //next node ko current node banaoo
        }
        //agar current node ka next null ho jaye
        System.out.println("Null");


    }

    //delete First
    public void deleteFirst(){
        //corner case
        if(head==null){
            System.out.println("The list is empty");
            return;

        }
        size--;
        head=head.next;
    }
    //delete last
    public void deleteLast() {
        //corner case
        //corner case
        if (head == null) {
            System.out.println("The list is empty");
            return;

        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
   /*REVERSE LINKEDLIST USING ITERATIVE APPROACH
    public void reverseIterate(){
        //corner cases
        if(head==null||head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;   //ulta jaooo


            //update---> for another next 3 nodes
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }*/

    //REVERSE LINKEDLIST USING RECURSIVE APPROACH
    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;

    }

    public static void main(String []args){
        LinkedList list =new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

       // list.deleteFirst();
        //list.printList();

      //  list.deleteLast();
       // list.printList();

        System.out.println(list.getSize());

       // list.reverseIterate();
        list.head=list.reverseRecursive(list.head);
        list.printList();


    }
}
