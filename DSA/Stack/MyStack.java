package DSA.Stack;

public class MyStack {
	private int top = 0;
	private int capacity = 2;
	private int stack [] = new int[capacity];

	public void show() {
		if (getSize() == 0) 
			System.out.println("Stack is empty");
		else {
			for (int i = 0; i < getSize(); i++) {
				System.out.print(stack[i] + " ");
			}
		}
	}

	public void push(int data) {
		if (getSize() == capacity) 
			expand();
		stack[top++] = data;
	}

	private void expand() {
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, getSize());
		capacity *= 2;
		stack = newStack;
	}

	public int pop() {
		int data = 0;
		if (top == 0)
			System.out.println("The stack is empty ...");
		else {
			if (getSize() <= ((capacity / 2) / 2) + 1)
				shrink();
			data = stack[--top];
			stack[top] = 0;
		}
		return data;
	}

	private void shrink() {
		int newStack[] = new int[capacity / 2];
		System.arraycopy(stack, 0, newStack, 0, getSize());
		capacity = capacity / 2;
		stack = newStack;
	}

	public void peek() {
		System.out.println("The topmost element is : " + stack[top - 1]);
	}

	public void isEmpty() {
		System.out.println(top==0 ? "The stack is empty ....":"The stack is not empty ...");
	}

	public int getSize() {
		return top;
	}

}
