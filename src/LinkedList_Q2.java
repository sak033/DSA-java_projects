

//Definition for singly-linked list.
public class LinkedList_Q2 {
    int val;
    LinkedList_Q2 next;
    LinkedList_Q2(){}
    LinkedList_Q2(int val)
    {
        this.val=val;
        this.next=null;
    }
}

class Solution1 {
    public LinkedList_Q2 reverse(LinkedList_Q2 head){
        LinkedList_Q2 prev=null;
        LinkedList_Q2 curr=head;

        while(curr!=null ){
            LinkedList_Q2 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public LinkedList_Q2 findMiddle(LinkedList_Q2 head){
        LinkedList_Q2 hare=head;
        LinkedList_Q2 turtle=head;

        while(hare.next!=null&& hare.next.next!=null){
            hare =hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(LinkedList_Q2 head){
        //khali hain ya ek hi node hain to vo palindrome hain
        if(head==null||head.next==null){
            return true;
        }
        LinkedList_Q2 middle=findMiddle(head);  // 1st half ka end
        LinkedList_Q2 secondHalfStart = reverse(middle.next);

        //comparision
        LinkedList_Q2 firstHalfStart=head;
        while(secondHalfStart!=null){
            if(firstHalfStart.val!=secondHalfStart.val){
                return false;
            }
            //update
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;   //list palindrome hain
    }
}
class TestSolution1{
    public static void main(String[] args) {
        // Create a linked list with 5 nodes: 1 -> 2 -> 3 -> 2 -> 1
        LinkedList_Q2 node1 = new LinkedList_Q2(1);
        LinkedList_Q2 node2 = new LinkedList_Q2(5);
        LinkedList_Q2 node3 = new LinkedList_Q2(3);
        LinkedList_Q2 node4 = new LinkedList_Q2(2);
        LinkedList_Q2 node5 = new LinkedList_Q2(1);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Create a Solution object and check if the list is a palindrome
        Solution1 solution = new Solution1();
        boolean result = solution.isPalindrome(node1);

        // Print the result
        System.out.println("Is the linked list a palindrome? " + result);
    }
}

