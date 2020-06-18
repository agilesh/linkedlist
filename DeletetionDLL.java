import java.util.Scanner;

public class DeletetionDLL {
	
	static Node head,tail;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{ 
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}

	
	public void appendatLast(int data)
	{
		Node newNode = new Node(data);
		newNode.data=data;
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
			tail=temp.next;
		}
	}
	
	public void deleteAtFirst()
	{
		Node deletingNode = head;
		if(deletingNode.next==null)
		{
			deletingNode=deletingNode.next;
		}
		else
		{
			Node x = deletingNode.next;
			deletingNode.next.prev=null;
			deletingNode.next=null;
			head=x;
		}
	}
	
	public void deleteAtLast()
	{
		if(head==tail)
		{
			head=head.next;
		}
		else
		{
		Node deletingNode = tail.prev;
		
	    
		deletingNode.next=null;
		tail=deletingNode;
		}
		
	}
	
	
	public void deleteAtPosition(int position)
	{
		Node temp = head;
		int i=1;
		while(i<position)
		{
			temp=temp.next;
			i++;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		
	}
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	public void reverse()
	{
		Node current = head;
		Node next;
		while(current!=null)
		{
			next=current.next;
			current.next = current.prev;
			current.prev=next;
			current = next;
		}
		head=current;
		head=tail;
		tail=current;
		
		
	}
	
	
	

	
	public static void main(String[] args)
	{
		DeletetionDLL obj = new DeletetionDLL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of inputs");
		int n = sc.nextInt();
		System.out.println("Enter the inputs");
		for(int i=0;i<n;i++)
		{
			obj.appendatLast(sc.nextInt());
		}
		obj.printList();
//		System.out.println("deleting firstNode"+head.data);
//		obj.deleteAtFirst();
//		System.out.println("new head is"+head.data);
//		System.out.println("the last node is "+tail.data);
//		obj.deleteAtLast();
//		System.out.println("the new last node is "+tail.data);
//		obj.deleteAtLast();
//	  System.out.println("the nw nw last node is"+tail.data);
	 // System.out.println("enter the position to delete data");
	 // int pos = sc.nextInt();
	//	obj.deleteAtPosition(pos);
	//  obj.deleteAtFirst();
	//	obj.printList();
		obj.reverse();
		
		obj.printList();
		
		
	}
}
