public class Recursion1 {
    public static void printNumber(int n){
        //base case
        if(n==0){
            return;
        }

        System.out.println(n);
        printNumber(n-1);  //recursion
    }

    public static void main(String args[]){
        int n=5;
        printNumber(n);  //call
    }
}
