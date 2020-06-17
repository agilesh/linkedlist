// using fast and slow pointers
public class NthNodeFromEnd {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}
	}
	
	void printNthNodeFromLast(int n)
	{
		Node fastptr=head;
		Node slowptr=head;
		
		int count=0;
		if(head!=null)
		{
			while(count<n)
			{
				fastptr=fastptr.next;
				count++;
			}
		}
		while(fastptr!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next;
		}
		System.out.print(slowptr.data);
		
		
	}
	
	
	public void push(int data)
	{
		Node temp = new Node(data);
		temp.next=head;
		head=temp;
		
	}
	
	public static void main(String[] args)
	{
		NthNodeFromEnd obj = new NthNodeFromEnd();
		obj.push(20);
		obj.push(4);
		obj.push(15);
		obj.push(35);
		
		
		
		obj.printNthNodeFromLast(2);
	}

}
