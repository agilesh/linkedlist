
public class insertioninDLL {

	
	static Node head;
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data = data;
			this.next=null;
			this.prev= null;
		}
	}
	
	
	public void insertfromfirst(int data)
	{
		Node newNode = new Node(data);
		newNode.data = data;
		
		
		if(head==null)
		{
			head=newNode;
		}
		
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
		
	}
	
	
	
	
	
	
	public void appendfromlast(int data)
	{
		
		     Node newNode = new Node(data);
		     newNode.data = data;
		    
		     
		     if(head==null)
		     {
		    	 head=newNode;
		     }
		     else
		     {
		    	 Node p = head ;
		    	 while(p.next!=null)
		    	 {
		    		 p = p.next;
		    	 }
		    	 p.next = newNode;
		    	 newNode.prev = p;
		    	  
		     }
	}
	
	
	public void insertAtAnyposition(int data , int position)
	{
		
		Node newNode = new Node(data);
		newNode.next=null;
		newNode.prev=null;
		Node p = head;
		
		int i=0;
		while(i<position)
		{
			i++;
			p=p.next;
		}
		
		
		newNode.next = p.next;
		p.next.prev = newNode;
		newNode.prev=p;
		p.next = newNode;
		
	}
	
	
	
	
	public void display(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
		    temp= temp.next;
		}
	}
	
	public void length()
	{
		
		int len=1;
		Node temp = head;
		if(temp==null)
		{
			System.out.println("empty");
		}
		else
		{
		while(temp!=null)
		{
			len++;
			temp = temp.next;
		}
		System.out.println("length is "+len);
		}
	}



	public static void main(String[] args)
	{
		insertioninDLL obj = new insertioninDLL();
		obj.appendfromlast(10);
		obj.appendfromlast(20);
		obj.appendfromlast(30);
		obj.appendfromlast(40);
		//obj.display(head);
		//obj.insertfromfirst(999);
		//obj.display(head);
		obj.length();
		obj.insertAtAnyposition(10000, 2 );
		obj.display(head);
		
	}

}