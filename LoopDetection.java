import java.util.*;
public class LoopDetection {

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
	 
	 public static boolean isLoop(Node n)
	 {
		 Set<Node> set = new HashSet<Node>();
		 while(n!=null)
		 {
			 if(set.contains(n))
			 {
				 return true;
			 }
			 set.add(n);
			 n=n.next;
		 }
		 return false;
	 }
	 public void push(int data)
	 {
		 Node temp = new Node(data);
		 temp.data=data;
		 temp.next=head;
		 head=temp;
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 LoopDetection obj = new LoopDetection();
		 obj.push(23);
		 obj.push(227);
		 obj.push(262);
		 obj.push(43);
	 
		 obj.head.next=obj.head;
		 if(isLoop(head))
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("no");
		 }
	 }
	
}
