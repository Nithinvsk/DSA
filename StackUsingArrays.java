package dsa;
import java.util.*;

public class StackUsingArrays {
	static int n;
	static int stk[];
	static int top;
	
	static void push(int ele) {
		if (top == n-1) {
			System.out.println("Stack is Overflow");
		}
		else {
			stk[++top] = ele;
		}
	}
	
	static void pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("The Deleted element is : "+stk[top]);
			top--;
		}
	}
	
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		n = nt.nextInt();
		stk = new int[n];
		top = -1;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the Option : ");
			int option = nt.nextInt();
			if (option == 0) {
				System.out.print("Enter the Element : ");
				int ele = nt.nextInt();
				push(ele);
			}
			else {
				pop();
			}
		}
		if(top == -1) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.print(stk[i]+" ");
			}
		}
	}
}
