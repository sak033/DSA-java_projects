import java.util.*;

public class Pattern1 {
    public static void main(String args[]){
        int n=5;
        int number=1;

/*//solid rectangle
        //outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
     /*hollow rectangle
        //outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/
       /*print the pattern
        *
        **
        ***
        ****
        */
        /*outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
      /*print the pattern
      ****
      ***
      **
      *

        //outer loop
        for(int i=n; i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
//print the pattern

        /*outer loop
        for(int i=n; i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*print the pattern
        1
        12
        123
        1234
        12345
         */
        /*outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }*/

        /*print the pattern
        12345
        1234
        123
        12
        1
         */
        /*outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }

            System.out.println();
        }*/
       /*print the pattern
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
        */
        /*for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }

            System.out.println();
        }*/


        /*print the pattern
        1
        01
        101
        0101
        10101

         */
        //outer loop
        for(int i=1;i<=n; i++){
            for(int j=1; j<=i;j++){
                int sum=i+j;
                if(sum % 2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");

                }

            }
            System.out.println();
        }
    }


}
