public class Recursion6 {
    public static boolean isSprted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            return isSprted(arr, idx+1);
        }
        else{
            return false;
        }
    }

    public static void main(String []args){
        int arr[]={1,2,4,4};
        System.out.println(isSprted(arr,0));

    }
}