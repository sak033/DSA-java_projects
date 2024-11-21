import java.util.Stack;
//Q.1 Push at the bottom of Stack
public class Stack_CollectionFramework {
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
    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom( 4,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
