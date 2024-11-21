public class Trie {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children=new Node[26]; //a to z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow = false;
        }
    }
    static Node root= new Node();

    //insert in trie
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx]==null){
                //add new node
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }

            curr=curr.children[idx];
        }
    }

    //search in trie
    public static boolean search(String key){
        Node curr=root;
       for(int i=0;i<key.length();i++){
           int idx=key.charAt(i)-'a';

           if(curr.children[idx]==null){
               return false;
           }
           if(i==key.length()-1 && curr.children[idx].eow==false){
               return false;
           }
           curr=curr.children[idx];
       }
       return true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }

        for(int i=1; i<=key.length();i++){
            String firstPart = key.substring(0,i); //does not include i
            String secondPart = key.substring(i);
            if(search(firstPart)&& wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    //Q.2Starts with
    public static boolean startsWith(String prefix){
      Node curr=root;

      for(int i=0; i<prefix.length(); i++){
          int idx=prefix.charAt(i)-'a';

          if(curr.children[idx]==null){
              return false;
          }
          curr= curr.children[idx];
      }
        return true;

    }

    //Q.3 Count unique Substring
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int count =0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count+=countNode(root.children[i]);
            }
        }
        return count +1;
    }


    //Q.4
    public static String ans=" " ;

    public static void longestWord(Node root, StringBuilder temp){
      if(root==null){
          return;
      }

      for(int i=0; i<26; i++){
          if(root.children[i]!= null && root.children[i].eow==true){
              temp.append((char)(i+'a'));
              if(temp.length()>ans.length()){
                  ans= temp.toString(); //toString()--> to convert StringBuilder to string
              }
              longestWord(root.children[i],temp);

              temp.deleteCharAt(temp.length()-1);
          }
      }
    }

    public static void main(String []args){
       /* String words[]={"the","a","there","their","any"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));

        */
       /*Q.1 Word break problem
        String words[]={"i","like","sam","samsung","mobile"};
        String key="ilikesamsung";

        //create trie
        for(int i=0;i<words.length;i++) {
            insert(words[i]);
        }
        System.out.println(wordBreak(key));

        */

        /*Q.2 StartsWith problem
        String words[]={"apple","app","mango","man","women"};
        String prefix= "app";

        for(int i=0;i<words.length;i++) {
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));

         */

        /*Q.3  Count Unique Substrings
        String str="ababa";
        //suffix
        for(int i=0; i<str.length();i++){
            String suffix = str.substring(i);  // i se lekar last index tak
            //System.out.println(suffix);

            //insert into trie
            insert(suffix);
        }
        System.out.println(countNode(root));

         */

        //Q.4 Longest word with all prefixes

        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        longestWord(root,new StringBuilder(""));
        System.out.println(ans);
    }
}
