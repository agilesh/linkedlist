

public class LengthOfLoopedLinkedList
{

	static int length=1;
	static Node head;
	static class Node
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
		Node temp  = new Node(data);
		temp.data=data;
		temp.next=head;
		head=temp;
	}
	
	
	Node lengthofLinkedList(Node head)
	{
		Node fastptr = head;
		Node slowptr = head;
		boolean loopexist=false;
		while(slowptr!=null && fastptr!=null && fastptr.next!=null)
		{
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
			if(slowptr==fastptr)
			{
			    loopexist=true;
				System.out.println("loop detected at"+slowptr.data);
				break;
			}
			
		}
		if(loopexist)
		{
			
			
			fastptr=fastptr.next;
			while(slowptr!=fastptr)
			{
				fastptr=fastptr.next;
				length++;
			}
			System.out.print(length +"is the length");
			
		}
		return null;
		
		
	}
	
	
	public static void main(String[] args)
	{
		LengthOfLoopedLinkedList obj = new LengthOfLoopedLinkedList();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(7);
		
		
		obj.head.next.next.next.next = obj.head;
		obj.lengthofLinkedList(head);
		
		
	}
	
	
		
}
	

