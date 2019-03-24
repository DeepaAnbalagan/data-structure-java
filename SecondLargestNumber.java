public class SecondLargestNumber {
    public static void main(String args[]){
        int arr[]= {34,7,90,25,98,12,96,29};
        int max = arr[0];
        int secondMax = arr[1];
        if(secondMax > max){
            max =secondMax;
            secondMax = arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax + " " +max);
    }
}
