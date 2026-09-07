package dsa;
import java.util.*;

public class StackUsingInBuildFunctions {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		int n = nt.nextInt();
		
		Stack<Integer> stk = new Stack<>();
		for(int i=0;i<n;i++) {
			int ele = nt.nextInt();
			stk.push(ele);
		}
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
	}
}
