package dsa;
import java.util.*;

class Node {
	int data;
	Node next;
	
	/*Node (int data) {
		this.data = data;
		this.next = null;
	}*/
}

public class QueueImplementationUsingLinkedList {
	static Node front = null;
	static Node rear = null;
	
	static void Enqueue(int ele) {
		Node newnode = new Node();
		newnode.data = ele;
		newnode.next = null;
		
		if (front == null && rear == null) {
			front = rear = newnode;
		}
		else {
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	static void Dequeue() {
		if(front == null) {
			System.out.println("Queue is Empty");
		}
		else {
			 Node temp = front;
			front = front.next;
			if ( front == null) {
				rear = null;
			}
			System.out.print("The Deleted Element is : "+temp.data);
		}
	}
	
	static void Display() {
		if (front == null) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.print("The Elements in the Queue : ");
			Node temp = front;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		while(true) {
			System.out.println("The Operations are : ");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			
			System.out.print("Enter the Choice : ");
			int choice = nt.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.print("Enter the Element : ");
				int ele = nt.nextInt();
				Enqueue(ele);
				break;
				
			case 2 :
				Dequeue();
				break;
				
			case 3 :
				Display();
				break;
				
			case 4 :
				System.out.println("Exit from the code");
				return;
				
			default :
					System.out.println("Enter the valid number");
			}
			System.out.println();
		}
	}
}
