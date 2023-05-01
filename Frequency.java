import java.util.*;
public class Frequency {
    static void countfreq(int arr[],int n){
        Map<Integer,Integer> hm=new HashMap<>();

//        Traverse into the array//
        for(int i=0; i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }

        }
//        traverse into the hashmap//
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            System.out.println("Number: " + entry.getKey() + " " + "Frequency "+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,4,6,1,2,8,9,10};
        int n= arr.length;
        countfreq(arr,n);
    }
}
// T.c: O(N) , S.C: O(N)