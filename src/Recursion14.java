public class Recursion14 {
    public static int placeTiles(int n, int m){
        //base case1
        if(n==m){
            return 2;
        }
        //base case 2
        if(n<m){
            return 1;
        }

        //vertically
        int vertPlacement=placeTiles(n-m,m);
        //horizontally
        int horPlacement=placeTiles(n-1,m);

        return vertPlacement+horPlacement;
    }
    public static void main(String []args){
        int n=4, m=2;
        System.out.println(placeTiles(n,m));
    }
}
