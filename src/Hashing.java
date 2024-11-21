import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String []args){
      //Creating
        HashSet<Integer> set= new HashSet<>();     //define set

        //insert elements in set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size
        System.out.println("Size of set is:"+ set.size());

        //Print all elements
        System.out.println(set);

        //Iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //search elements--->special function contains()
        if(set.contains(1)){
            System.out.println("set Contains 1");

        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We deleted 1");
        }

        //size
        System.out.println("Size of set is:"+ set.size());

        //Print all elements
        System.out.println(set);
    }
}
