
import java.util.EmptyStackException;

public class LinkedList {

	Node head;

	public void append(int data) {
		if (head == null)
			head = new Node(data);
		else {
			Node current = head;
			while (current.next != null) {
				current = current.next;

			} // while
			current.next = new Node(data);
		} // else
	}

	public void printall(LinkedList ll) {
		Node ll1 = ll.head;
		while (ll1 != null) {
			System.out.println(ll1.data);
			ll1 = ll1.next;
		} // while
	}

	public boolean intersection(LinkedList list1, LinkedList list2) {
		Node llist1 = list1.head;
		Node llist2 = list2.head;
		while (llist1 != null && llist2 != null) {
			if (llist1.data == llist2.data)
				return true;
			else {
				llist1 = llist1.next;
				llist2 = llist2.next;
			} // else
		} // while
		return false;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		ll.append(9);
		ll.append(7);
		ll.append(9);
		ll.append(12);
//		ll.printall(ll);

		ll2.append(3);
		ll2.append(44);
		ll2.append(9);
		ll2.append(12);
//		ll2.printall(ll2);
		boolean bool = ll2.intersection(ll, ll2);
		if (bool)
			System.out.println("The Lists do interset");
		else
			System.out.println("The Lists don't interset");

		System.out.println("Time to test the stack");

		MyStack stack = new MyStack();
		try {
			stack.popOut();
		} catch (EmptyStackException e) {
			System.out.println("The stack is empty");
		}
//		System.out.println("yahoo");
		stack.pushIn(25);
		stack.pushIn(100);
		stack.pushIn(5);
		System.out.println("The first value in the stack is: " + stack.popOut());
		System.out.println("The max value in the stack is: " + MyStack.max);
	}
}
