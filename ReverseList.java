

public class ReverseList
{
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
	
	public void insert(int data)
	{
		Node newNode = new Node( data);
		newNode.data = data;
		newNode.next = head;
		head=newNode;
	}
	
	Node reverse(Node head)
	{
		Node currentPtr , nextPtr , prevPtr;
		prevPtr = null;
		currentPtr = head;
		while(currentPtr!=null)
		{
			nextPtr = currentPtr.next;
			currentPtr.next = prevPtr;
			prevPtr =currentPtr;
			currentPtr = nextPtr;
			
		}
		head=prevPtr;
		return head;
	}
	
	
	void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	
	public static void main(String[] args)
	{
		ReverseList obj = new ReverseList();
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		System.out.println("before reversing");
		obj.printList(head);
		System.out.println("after reverse");
		head=obj.reverse(head);
	    obj.printList(head);
		
	}
	

}