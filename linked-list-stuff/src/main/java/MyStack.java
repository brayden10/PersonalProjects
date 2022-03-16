
import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
	Stack<Integer> s;
	static int max = 0;

	public MyStack() {
		s = new Stack<Integer>();
	}

	public void pushIn(Integer c) {
		int x = 0;
		if (!s.empty()) {
			x = s.peek();
			if (x > max) {
				max = x;
			}
		} // if
		s.push(c);
	}

	public Integer popOut() throws EmptyStackException {
		Integer i;
		if (s.size() == 0)
			throw new EmptyStackException();
		else {
			i = s.pop();
		}
		return i;
	}
}
