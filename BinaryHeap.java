package Tree;

import com.bettercloud.vault.api.Sys;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;

/**
 * @author deepa.a
 */
public class BinaryHeap {
    // This algorithm is for min heap
    int MAX_SIZE = 5;
    int arr[] = new int[MAX_SIZE];
    int heapSize =0 ;

    public static void main(String args[]){
        BinaryHeap obj = new BinaryHeap();
        obj.insert(10);
        obj.insert(1);
        obj.insert(5);
        obj.insert(9);
        obj.insert(3);
        obj.printBinaryHeap();
        obj.extractMin();
        System.out.println();
        obj.printBinaryHeap();
    }

    int parent(int i){
        return (i-1)/2;
    }

    int left(int i){
        return 2*i+1;
    }

    int right(int i){
        return 2*i+2;
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void insert(int input){

        heapSize++;
        int tmp = heapSize-1;
        arr[tmp] = input;
        while(tmp!=0 &&  arr[parent(tmp)] > arr[tmp]){
            swap(tmp, parent(tmp));
            tmp = parent(tmp);
        }
    }
    public void printBinaryHeap(){
        for(int element: arr ){
            System.out.print(element + " ");
        }
    }

    public void heapify(int index){
        int smaller = index;
        int left = left(index);
        int right = right(index);
        if(left < heapSize && arr[left]< arr[index]){
            smaller = left;
        }
        if(right < heapSize && arr[right] < arr[smaller]){
            smaller = right;
        }
        if(smaller != index){
            swap(index, smaller);
            // index = smaller;
            heapify(smaller);
        }
    }

    int extractMin(){
        if(heapSize == 0){
            return 0;
        }
        if(heapSize == 1){
            heapSize--;
            return arr[0];
        }
        int min = arr[0];
        arr[0] = arr[heapSize-1];
        heapSize--;
        heapify(0);
        return min;

    }
}
