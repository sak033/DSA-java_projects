public class Recursion3 {
    //print sum of first n natural numbers
    //1.main f(x)-->1
    //2.base condition-->n
    //3.kaam-wwork-->calculate sum

    public static void printSum(int i,int n,int sum){
       //base case
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        //work
        sum+=i;
        printSum(i+1,n,sum);
    }

    public static void main(String args[]){
       printSum(1,5,0);
    }
}
