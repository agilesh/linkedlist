
public class insertion {
	
	static Node head;
	
	class Node
	{
		int data;
		Node next;
		
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void  defaultinsert(int data)
	{
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode ; 	
	}
	
	public void insertAtPosition(int data , int position)
	{
		Node newNode = new Node(data);
		Node nextNode , currentNode;
		nextNode = head;
		currentNode = null;
		int count=1;
		while(nextNode!=null && count<position)
		{
			count++;
			currentNode = nextNode;
			nextNode = nextNode.next;
		}
		currentNode.next = newNode;
		newNode.next = nextNode;
		
	}
	
	public void insertAtLast(int data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		int pos=1;
		while(temp.next!=null)
		{
		temp=temp.next;	
		}
		temp.next = newNode;
		
		
	}
	
	public void print()
	{
		Node node = head;
		while(node!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	
	public static void main(String[] args)
	{
		insertion obj = new insertion();
		obj.defaultinsert(6);
		obj.defaultinsert(5);
		obj.defaultinsert(4);
		obj.defaultinsert(3);
		obj.defaultinsert(2);
		obj.defaultinsert(1);
		obj.insertAtLast(9);
		obj.insertAtPosition(000, 3);
		obj.print();
		
	}

}
