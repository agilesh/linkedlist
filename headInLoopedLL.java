
public class headInLoopedLL
{

	
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

	private String Node;
	
	
	public void insert(int data)
	{
		Node temp  = new Node(data);
		temp.data=data;
		temp.next=head;
		head=temp;
	}
	
	
	Node detectLoop(Node head)
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
			slowptr=head;
			while(slowptr!=fastptr)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next;
			}
			System.out.print("headd"+slowptr.data);
			return slowptr;
		}
		return null;
		
		
	}
	
	
	public static void main(String[] args)
	{
		headInLoopedLL obj = new headInLoopedLL();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		
		
		obj.head.next.next.next.next.next = obj.head;
		
		System.out.print(obj.detectLoop(head));
	}
	
	
		
	}
	

