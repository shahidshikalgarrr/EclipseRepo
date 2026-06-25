package day3;

public class TestStackQueue {

	public static void main(String[] args) {
		Stack st = new Stack();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(50);
		st.push(40);

		st.delete();
		st.view();

		System.out.println(" ");

		Queue q = new Queue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(90);

		q.deque();
		q.view();
	}

}
