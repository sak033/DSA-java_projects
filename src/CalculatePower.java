//print x^n (stack height=n)

public class CalculatePower {
    public static int calcPower(int x, int n){
        //base case1
        if(n==0){
            return 1;
        }
        //base case2
        if(x==0){
            return 0;
        }
        //kaam
        int xPowm1=calcPower(x,n-1);  //inner function
        int xPown=x * xPowm1;
        return xPown;
    }
    public static void main(String []args){
        int x=2, n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);

    }
}
