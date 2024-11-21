//print all permutations of string "abc"
public class Recursion12 {
    public static void printPerm(String str, String permutation){
        //base case
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }


        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //"abc"-->"ab" if b is current character
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,permutation+currChar);
        }
    }

    public static void main(String []args){
        String str="abc";
        printPerm(str,"");
    }
}
