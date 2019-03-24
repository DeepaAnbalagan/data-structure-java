import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class SolveNumberOfProblems {

    public static void main(String args[]){
        // either i+1 or i+2
        int arr[] = {1,2,3};
        int k = 2;
        // Map
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        // find the min
        int min =arr[0];
        int start = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                start = i;
            }
        }
        int index = 0;
        int count =0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            int diff = k+arr[i];
            if(map.containsKey(diff)){
               index = map.get(diff);
               count =2;
               flag = true;
               break;
            }
        }
        count = count + (index+1)/2 -1;
        System.out.println(count);

    }
}
