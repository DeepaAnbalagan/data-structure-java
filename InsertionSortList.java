package algo;

public class InsertionSortList {

	/**
	 * @param args
	 */
	Node head;
	Node sorted=null;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public Node insert(int data)
	{
		if(head==null)
		{
			head=new Node(data);
		}
		else
		{
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
		}
		return head;
	}
	public void insertionSort(Node node)
	{
		
		Node curr=node;
		while(curr!=null)
		{
			//System.out.println("insortionsort");
			Node next=curr.next;
			sort(curr);
			curr=next;
		}
		head=sorted;
	}
	public void sort(Node newNode)
	{
		if(sorted==null||sorted.data>=newNode.data)
		{
		//	System.out.println("head sort");
			newNode.next=sorted;
			sorted=newNode;
		}
		else
		{
			//System.out.println("node sort");
			Node current=sorted;
			while(current.next!=null&&current.next.data<newNode.data)
			{
				//System.out.println("while loop 2");
				current=current.next;
			}
			newNode.next=current.next;
			current.next=newNode;
		}
	}
	public void printList(Node list)
	{
		while(list!=null)
		{
			System.out.print(list.data+" ");
			list=list.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertionSortList list=new InsertionSortList();
		list.insert(5);
		list.insert(20);
		list.insert(4);
		list.insert(3);
		list.insert(30);
		list.printList(list.head);
		System.out.println();
		list.insertionSort(list.head);
		list.printList(list.head);
		
	

	}

}
