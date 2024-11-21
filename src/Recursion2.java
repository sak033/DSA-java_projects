public class Recursion2 {
    //print no. from 1 to 5
    public static void printNumber(int n){
        //base case
        if(n==6){
            return;
        }

        System.out.println(n);
        printNumber(n+1);  //recursion
    }

    public static void main(String args[]){
        int n=1;
        printNumber(n);  //call
    }
}
