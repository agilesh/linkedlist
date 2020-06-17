

public class deletions {

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
	
	public void  insert(int data)
	{
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode ; 	
	}
	
	
	
	public void deleteAtFirst()
	{
		head = head.next;
	}
	
	public void deleteAtposition(int position)
	{
		Node currentNode , prevNode=null;
		currentNode = head;
		int count = 1 ; 
		while(currentNode!=null && count < position)
		{
			position++;
			prevNode=currentNode;
			currentNode = currentNode.next;
		}
		try
		{
	prevNode.next=currentNode.next;
		}catch(NullPointerException e)
		{
			System.out.println("deleted");
		}
	
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
		deletions obj = new deletions();
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		obj.deleteAtFirst();
		obj.deleteAtposition(2);
		obj.print();
		
	}
}
