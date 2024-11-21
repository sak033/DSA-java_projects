import java.util.*;
public class Hashing_Q1 {
    public static void majorityElement(int num[]){
        //create hashMap
        HashMap<Integer,Integer> map=new HashMap<>();

        //form key-value pair
        int n=num.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(num[i])){
                //true
                map.put(num[i],map.get(num[i])+1);
            }
            else{
                //false
                map.put(num[i],1);
            }
        }

        //Find Majority Element
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String []args){
        int num[]={1,3,2,5,1,3,1,5,1};
        majorityElement(num);
    }
}
