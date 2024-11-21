
// Implementation of stack using Linked List
public class StackClass {
    static class Node{
       int data;
       Node next;
       public Node(int data){
           this.data=data;  // initialize the data
           next=null;
       }
    }

    static class Stack{
        public static Node head;
        public Object push;
        public boolean peek;
        public Object pop;

        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data ){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        // detele top element and return deleted element
       public static int pop(){
            if (isEmpty()){
                return -1;
            }

        int top = head.data;
        head= head.next;
        return top;
       }
       // peek function return top
       public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
       }
    }
    public static void main(String []args){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
