package dsa;
import java.util.*;

public class QueueImplementationUsingArrays {
	static int n;
	static int queue[];
	static int front , rear;
	
	static void Enqueue(int ele) {
		if(front == n-1) {
			System.out.println("Queue is full");
		}
		else {
			if (front == -1) {
				front = 0;
			}
			rear++;
			queue[rear] = ele;
		}
	}
	
	static void Dequeue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("The Deleted element is : "+queue[front]);
			front++;
		}
	}
	
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		int t = nt.nextInt();
		while(t-- > 0) {
			n = nt.nextInt();
			queue = new int[n];
			front = -1;
			rear = -1;
			for(int i=0;i<n;i++) {
				int option = nt.nextInt();
				if (option == 0) {
					int ele = nt.nextInt();
					Enqueue(ele);
				}
				else {
					Dequeue();
				}
			}
			if (front == -1 || front > rear) {
				System.out.println("Queue is Empty");
			}
			else {
			System.out.print("The Elements in the Queue : ");
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
			System.out.println();
			}
		}
	}
}
