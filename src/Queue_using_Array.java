public class Queue_using_Array {
    static class Queue{
        //define array
        static int arr[];
        static int size;
        static int rear=-1;  //no need to create front cuzz front is already 0
        //constructor
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //Add-->enqueue-->O(1)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue-->O(n)
        //int-->remove karne ke sath sath remove kiya vala element bhi return ho ki ye remove kiya hain
        public static int remove(){
           if(isEmpty()){
               System.out.println("empty queue");
               return -1;
           }
           int front=arr[0];
           for(int i=0; i<rear;i++){
               arr[i]=arr[i+1];  //i+1 me jo value hain vo age badhegi aur i me jayegi

           }
           rear--;
           return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }


    }
    public static void main(String []args){
      //implement
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
