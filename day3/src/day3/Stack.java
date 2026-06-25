package day3;

public class Stack {
	
	int stack[] = new int[5];
	int top = -1;
	
	public void push(int data) {
		if(top == 4) 
			System.out.println("Stack Overflow");
		else {
			top++;
			stack[top] = data;
		}
	}
	
	public void delete() {
		if(top == -1)
			System.out.println("Nothing to delete, Stack is Empty");
		else {
			top--;
		}
	}
	public void view() {
		if(top == -1)
			System.out.println("Nothing to delete, Stack is Empty");
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
	}
}
