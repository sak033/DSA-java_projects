import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String []args){
        ArrayList<Integer> list1=new ArrayList<Integer>();

        //add elements--> appneds arraylist from last part
        list1.add(0);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        //get element-->here indexing is used
        int element=list1.get(0);
        System.out.println(element);

        //add element in between--> here first index given where we add element
        // and second is what element we want to be add in arryalist
        list1.add(1,1);
        System.out.println(list1);

        //set element--> modify element
        list1.set(0,5);
        System.out.println(list1);

        //delete element
        list1.remove(3);
        System.out.println(list1);

        //size
       int size= list1.size();
        System.out.println(size);

        //loops
        //1. for loop
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list1);
        System.out.println(list1);

    }
}
