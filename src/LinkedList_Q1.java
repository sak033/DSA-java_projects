

//Definition for singly-linked list.
public class LinkedList_Q1 {
int val;
LinkedList_Q1 next;
LinkedList_Q1(){}
LinkedList_Q1(int val)
{
    this.val=val;
    this.next=null;
}
}

class Solution{
    public LinkedList_Q1 removeNthFromEnd(LinkedList_Q1 head, int n){
     if(head==null){
         return null;
     }
     //size
     int size=0;
     LinkedList_Q1 curr=head;
     while(curr !=null){
         curr=curr.next;
         size++;
     }
     if(n>size){
         return head;
     }
     if(n==size){
         return head.next;
     }
     //find preveious node off Nth node i.e. (Size-n) node
     int indexToSearch= size-n;
      LinkedList_Q1 prev =head;
     int i=1;
     while(i<indexToSearch){
         prev=prev.next;
         i++;
     }
     //remove the nth node from the end
     prev.next=prev.next.next;
     return head;
    }
}

// Testing the code in a main method
class TestSolution {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        LinkedList_Q1 head = new LinkedList_Q1(1);
        head.next = new LinkedList_Q1(2);
        head.next.next = new LinkedList_Q1(3);
        head.next.next.next = new LinkedList_Q1(4);
        head.next.next.next.next = new LinkedList_Q1(5);

        // Create a Solution object
        Solution sol = new Solution();

        // Remove the 2nd node from the end
        LinkedList_Q1 result = sol.removeNthFromEnd(head, 2);

        // Print the resulting linked list
        printList(result);
    }

    public static void printList(LinkedList_Q1 head) {
        LinkedList_Q1 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}