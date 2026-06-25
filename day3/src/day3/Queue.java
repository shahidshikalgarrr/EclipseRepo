package day3;

public class Queue {
	
	int queue[] = new int[5];
	int front = 0;
	int rear = -1;
	
	public void enqueue(int data) {
        if (rear == 4) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            queue[rear] = data;
        }
    }
	
	public void deque() {
		if(front>rear) {
			System.out.println("Queue Underflow");
		}
		else {
			front++;
		}
	}
	
	public void view() {
		if(front>rear) {
			System.out.println("Nothing to display, Queue Empty");
		}
		else {
			for(int i=front; i<=rear;i++) {
				System.out.println(queue[i]);
			}
		}
	}
}
