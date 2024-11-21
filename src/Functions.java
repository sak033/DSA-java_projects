import java.util.Scanner;

public class Functions {
   // public static int calculateSum(int a,int b ){
      //  int sum=a+b;
      //  return sum;
   // }

    public static int calculateProduct(int a,int b){
        int product=(a*b);
        return product;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();

        int product=calculateProduct(a,b);
        System.out.println(product);
    }
}
