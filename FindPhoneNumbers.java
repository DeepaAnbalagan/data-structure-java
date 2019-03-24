import java.util.ArrayList;
import java.util.HashMap;

public class FindPhoneNumbers {
    public static void main(String args[]){

        String arr[] = {"995557890", "9412101310"};
        final int count[] = {0};
        final boolean flag[] = {false};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // indexes should be a key and the
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length()-4;j++) {
                if (arr[i].charAt(j) == arr[i].charAt(j + 1) && arr[i].charAt(j) == arr[i].charAt(j + 2)) {
                        count[0] = count[0] + 1;
                    }
            }
            for(int j  = 0;j< arr[i].length();j++){
                   if(map.containsKey(arr[i].charAt(j))){
                       map.put(arr[i].charAt(j), map.get(arr[i].charAt(j))+1);
                   }
                   else{
                       map.put(arr[i].charAt(j),1);
                   }
                }
            map.forEach((key,value)->{
                if(value == 4){
                    count[0] = count[0]+1;
                }
            });
        }

        System.out.println("Number of options "+count);
    }
}
