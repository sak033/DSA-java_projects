import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n){
        int factorial=1;
        //loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i=n; i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFactorial(n);
    }
}
