//Question no.5

import java.util.*;
public class Hashing_Q6 {

    public static void main(String []args){
        int arr[]= { 10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer, Integer> map= new HashMap<>();

        map.put(0,1);  //  empty subarray
        int ans=0;
        int sum=0;
        for(int j=0; j<arr.length;j++){
            sum+=arr[j];

            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
