import java.util.*;
import java.util.LinkedList;

public class Queue_Using_CollectionFrameWork {
       // Q.1 Queuebusing 2 stack
    static class Queue{
        static Stack<Integer> q1=new Stack<>();
        static Stack<Integer> q2=new Stack<>();


           public static boolean isEmpty(){
               return q1.isEmpty();
           }

           public static void add(int data) {
               while (!q1.isEmpty()) {
                   q2.push(q1.pop());
               }
               q1.push(data);

               while (!q2.isEmpty()) {
                   q1.push(q2.pop());
               }
           }
           public static int remove(){
                   if(isEmpty()){
                       System.out.println("empty queue");
                       return -1;
                   }
                   return q1.pop();
               }

               public static int peek(){
                   if(isEmpty()){
                       System.out.println("empty queue");
                       return -1;
                   }
                   return q1.peek();
               }
           }





    public static void main(String []args){
        //implement
        //Queue q= new Queue();
       // Queue<Integer> q=new LinkedList<>();  //Queue is a interface and we can not made objects if interface so here Linked list is ude to creste objects
        Queue  q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}

