
import java.util.Scanner;
class Addition {
    public static void main(String[]args)
    {
        int n1,n2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no");
        n1=sc.nextInt();

        System.out.println("Enter the second no");
        n2=sc.nextInt();
        sum=n1+n2;
        System.out.println("Summation is "+sum);
    }
}
