public class LinkedList_Q3 {
    int val;
    LinkedList_Q3 next;
    LinkedList_Q3(){}
    LinkedList_Q3(int val)
    {
        this.val=val;
        this.next=null;
    }
}
 class Solution2{
    public boolean hasCycle(LinkedList_Q3 head){
        if(head==null){
            return false;
        }
        LinkedList_Q3 hare=head; //fast
        LinkedList_Q3 turtle= head; //slow

        while(hare !=null&& hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
    }

     // Method to remove the cycle in the linked list
     public void removeCycle(LinkedList_Q3 head) {
         if (head == null) {
             return;
         }

         LinkedList_Q3 hare = head;
         LinkedList_Q3 turtle = head;

         // First, detect the cycle
         boolean cycleDetected = false;
         while (hare != null && hare.next != null) {
             hare = hare.next.next;
             turtle = turtle.next;

             if (hare == turtle) {
                 cycleDetected = true;
                 break;
             }
         }

         // If cycle is detected
         if (cycleDetected) {
             // Reset turtle to head and find the start of the cycle
             turtle = head;

             // Edge case: when the cycle is at the head (hare and turtle already meet at the start)
             if (hare == head) {
                 // Move hare to the last node in the cycle
                 while (hare.next != turtle) {
                     hare = hare.next;
                 }
             } else {
                 // Normal case: move hare and turtle at the same pace to find the starting point of the cycle
                 while (hare.next != turtle.next) {
                     hare = hare.next;
                     turtle = turtle.next;
                 }
             }
             // Break the cycle by setting hare's next to null
             hare.next = null;
         }
     }

}

 class LinkedList_Q3_Test {
    public static void main(String[] args) {
        // Create nodes of the linked list
        LinkedList_Q3 node1 = new LinkedList_Q3(1);
        LinkedList_Q3 node2 = new LinkedList_Q3(2);
        LinkedList_Q3 node3 = new LinkedList_Q3(3);
        LinkedList_Q3 node4 = new LinkedList_Q3(4);
        LinkedList_Q3 node5 = new LinkedList_Q3(5);

        // Linking the nodes to form a linked list
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Test case 1: No cycle
        Solution2 solution = new Solution2();
        System.out.println("Test case 1 (No cycle): " + solution.hasCycle(node1)); // Expected output: false

        // Create a cycle for testing: linking node5 to node2
        node5.next = node2;

        // Test case 2: With cycle
        System.out.println("Test case 2 (With cycle): " + solution.hasCycle(node1)); // Expected output: true

        //Removing the cycle
        solution.removeCycle(node1);

        //test case 3: Afer removing the cycle
        System.out.println("Test case 3(cycle removed):"+solution.hasCycle(node1)); // Expected output:false


    }
}

