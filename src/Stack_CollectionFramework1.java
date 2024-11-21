import java.util.Stack;

public class Stack_CollectionFramework1 {

    public static void pushAtBottom(int data, Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        //recursive call
        pushAtBottom(data,s);
        s.push(top);
    }
  public static void reverse(Stack<Integer> s){
        // base case
       if(s.isEmpty()){
           return;
       }

        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);
  }

    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
