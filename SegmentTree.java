public class SegmentTree {
    // This is something similar to heap
    // Each internal node is sum of it's children
    int st[];
    SegmentTree(int arr[], int n){
        int height = (int)Math.ceil(Math.log(n)/Math.log(2));
        int memory = 2* (int) Math.pow(2,height)-1;
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));

        //Maximum size of segment tree
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        st = new int[memory];
        constructSegmentTree(arr, 0, arr.length-1, 0);
    }
    public int getMid(int start, int end){
        return (start+(end-start)/2);
    }
    // This is for the construction of the segment tree
    public int constructSegmentTree(int arr[], int start, int end, int index){
         if(start == end){
             st[index] = arr[start];
             return st[index];
         }
         else {
             int mid = getMid(start,end);
             st[index] = constructSegmentTree(arr, start, mid, 2*index+1) +
                     constructSegmentTree(arr, mid+1, end, 2*index+2);
             return  st[index];
         }

    }
    void print(){
        for(int i =0; i< st.length;i++){
            System.out.println(st[i]);
        }
    }
    public static void main(String args[]){
        // Give array
        int input[] = {1,3, 5};
        SegmentTree obj = new SegmentTree(input, input.length);
        //constructSegmentTree(input,0, end, index);
        obj.print();
    }
}
