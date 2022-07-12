package prasanna;

import java.util.*;

public class ShuffleList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Size of list");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("enter the int number");
			int x = sc.nextInt();
			list.add(x);
		}

		LinkedList<Integer> newlist = new LinkedList<Integer>();		
		while (list.size() != 0) {

			newlist.add(list.pollFirst());

			newlist.add(list.pollLast());
		}

		System.out.println(newlist);
		sc.close();
	}

}
