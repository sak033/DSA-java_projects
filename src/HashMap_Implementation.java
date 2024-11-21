import java.util.*;
import java.util.LinkedList;

public class HashMap_Implementation {

    static class HashMap1<K, V> {   //<K,V>--> generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n; //total no. of nodes
        private int N;  //total no of buckets
        private LinkedList<Node> buckets[];   //define buckets-->HashMap

        @SuppressWarnings("unchecked")


        public HashMap1() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;  // bucket index ki value 0 se N-1 ke bich me ayegi
        }

        // search kero linked list me
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; //di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        //rehashing
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);   //Array ka index
            int di = searchInLL(key, bi);   //Linked  list index(data index)

            if (di == -1) {
                //key doesn't exist

                //add new node
                buckets[bi].add(new Node(key, value));
                //n ki value badhegi
                n++;
            } else {
                //key exist
                Node node = buckets[bi].get(di);  //di pe jaoo
                node.value = value;     // aur update karo

            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                //rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);   //Array ka index
            int di = searchInLL(key, bi);   //Linked  list index(data index)

            if (di == -1) {
                //key doesn't exist
                return false;
            } else {
                //key exist
                return true;

            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);   //Array ka index
            int di = searchInLL(key, bi);   //Linked  list index(data index)

            if (di == -1) {
                //key doesn't exist
                return null;
            } else {
                //key exist
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);   //Array ka index
            int di = searchInLL(key, bi);   //Linked  list index(data index)

            if (di == -1) {
                //key doesn't exist
                return null;
            } else {
                //key exist
                Node node = buckets[bi].get(di);  //di pe jaoo
                return node.value;

            }

        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }


        public boolean isEmpty() {

            return n == 0;
        }
    }




    public static void main(String[] args) {
        HashMap_Implementation.HashMap1<String, Integer> map = new HashMap_Implementation.HashMap1<>();

        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 90);
        map.put("Indoneshia", 10);
        map.put("Pak", 30);
        map.put("Japan", 180);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}
