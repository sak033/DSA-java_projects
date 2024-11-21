import com.sun.source.tree.UsesTree;

import java.util.HashSet;

public class Recursion10 {
    public static void subSequences(String str, int idx, String newString, HashSet<String>set){
        //base case
        if(idx==str.length()){
          if(set.contains(newString)){
              return;
          }
          else{
              System.out.println(newString);
              set.add(newString);
              return;
          }
        }
        char currChar=str.charAt(idx);
        //to be
        subSequences(str,idx+1,newString+currChar, set);
        //not to be
        subSequences(str,idx+1,newString, set);
    }
    public static void main(String []args){
           String str="aaa";
        HashSet<String> set=new HashSet<>();
           subSequences(str,0,"",set);
    }
}
