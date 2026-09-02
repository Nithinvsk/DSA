package dsa;
import java.util.*;

public class QueueImplementationUsingBuildInFunctions {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		int n = nt.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			int ele = nt.nextInt();
			q.add(ele);
		}
		while (!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}
}
