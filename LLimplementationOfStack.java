import static java.lang.System.exit;

import java.util.Scanner; 
public class LLimplementationOfStack {
	
	public class Node
	{
		int data;
		Node next;
	}
	
	Node top;
	
	public LLimplementationOfStack() 
	{
		this.top=null;
	}
	
	public void push(int data)
	{
		Node temp = new Node();
		
		temp.data=data;
		temp.next=top;
		top=temp;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return top.data;
		}
		else
		{
			System.out.print("Empty list");
			return -1;
		}
	}
	
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("already empty");
		}
		else
		{
			top=top.next;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.print("underflow");
			exit(1);
		}
		else
		{
			Node dis=top;
			while(dis!=null)
			{
				System.out.print(dis.data);
				dis=dis.next;
			}
		}
	}

}



class Main
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		LLimplementationOfStack obj = new LLimplementationOfStack();
		for(int i=1;i<=5;i++)
		{
			obj.push(sc.nextInt());
		}
		
		obj.pop();
		obj.pop();
		System.out.println("peek"+obj.peek());
		obj.display();
		
	}

}

	

