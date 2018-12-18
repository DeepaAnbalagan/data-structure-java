package binaryheap;

public class BinaryHeap {

	/**
	 * @param args
	 */
	
	int capacity;
	static int heapSize=0;
	int arr[];
	BinaryHeap(int cap)
	{
		capacity=cap;
		
		arr=new int[cap];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap heap=new BinaryHeap(11);
		heap.insertKey(3);
		heap.insertKey(2);
		heap.deleteKey(1);
		heap.insertKey(15);
		heap.insertKey(5);
		heap.insertKey(4);
		heap.insertKey(45);
		System.out.println(heap.extractMin());
		System.out.println(heap.getMin());
		heap.decreaseKey(2, 1);
		System.out.println(heap.getMin());
		

	}
	int parent(int i)
	{
		return (i-1)/2;
	}
	int left(int i)
	{
		return i*2+1;
	}
	int right(int i)
	{
		return i*2+2;
	}
	void swap(int i,int j)
	{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	int getMin()
	{
		return arr[0];
	}
	void insertKey(int k)
	{
		if(heapSize==capacity)
			System.out.println("cannot insert");
		
			heapSize++;
			//System.out.println("heapSize"+heapSize);
			int temp=heapSize-1;
			//System.out.println("temp"+temp);
			arr[temp]=k;
			//System.out.println(parent(temp)+"...................."+arr[(parent(temp))]+"...."+arr[temp]);
			while(temp!=0&&arr[(parent(temp))]>arr[temp])
			{
				swap(temp,parent(temp));
				
				//System.out.println("value"+arr[temp]);
				temp=parent(temp);
			}
		
			
	}
	void heapify(int i)
	{
		int l=left(i);
		int r=right(i);
		int small=i;
		if(l<heapSize&&arr[l]<arr[i])
			small=l;
		 if(r<heapSize&&arr[r]<arr[small])
			small=r;
		 if(i!=small)
		 {
			 swap(i,small);
			 heapify(small);
		 }
		
	}
	public int extractMin()
	{
		if(heapSize==0)
			return 0;
		if(heapSize==1)
		{
			heapSize--;
		return arr[0];
		}
		int root =arr[0];
		arr[0]=arr[heapSize-1];
		heapSize--;
		heapify(0);
		return root;
		
	}
	public void decreaseKey(int i,int newVal)
	{
		arr[i]=newVal;
		while(i!=0&&arr[parent(i)]>arr[i])
		{
			swap(i,parent(i));
			i=parent(i);
		}
	}
	void deleteKey(int i)
	{
	    decreaseKey(i, Integer.MIN_VALUE);
	    extractMin();
	}
}
