public class Recursion9 {

        public static boolean[] map = new boolean[26];

        public static void removeDuplicates(String str, int idx, String newString) {
            // base case
            if (idx == str.length()) {
                System.out.println(newString);
                return;
            }

            // recursive function
            char currChar = str.charAt(idx);
            if (map[currChar - 'a']) {
                removeDuplicates(str, idx + 1, newString);
            } else {
                newString += currChar;
                map[currChar - 'a'] = true;
                removeDuplicates(str, idx + 1, newString);
            }
        }

        public static void main(String[] args) {
            String str = "abbccda";
            removeDuplicates(str, 0, "");
        }
    }


