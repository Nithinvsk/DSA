package dsa;
import java.util.*;

class Node {
	int data;
	Node next;
}

public class StackUsingLinkedList {
	static Node top = null;
	
	static void push(int ele) {
		Node newnode = new Node();
		newnode.data = ele;
		newnode.next = null;
		
		if(top == null) {
			top = newnode;
		}
		else {
			newnode.next = top;
			top = newnode;
		}
	}
	
	static void pop() {
		if (top == null) {
			System.out.println("Stack is Empty");
		}
		else {
			Node temp = top;
			top = top.next;
			System.out.println("The Deleted Element is : "+temp.data);
		}
	}
	static void display() {
		if (top == null) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.print("The Elements in Stack : ");
			Node temp = top;
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
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			
			System.out.print("Enter the Choice : ");
			int choice = nt.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.print("Enter the Element : ");
				int ele = nt.nextInt();
				push(ele);
				break;
				
			case 2 :
				pop();
				break;
				
			case 3 :
				display();
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
