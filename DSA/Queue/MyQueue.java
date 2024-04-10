package DSA.Queue;

public class MyQueue {
    private int capacity = 5;
    private int queue[] = new int[capacity];
    private int size;
    private int front;
    private int rear;

    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % capacity;
            size++;
        } else
            System.out.println("Queue is full....cannot enqueue");
    }

    public int deQueue() {
        if (!isEmpty()) {
            front = (front + 1) % capacity;
            size--;
            return queue[front];
        }
        System.out.println("Queue is Empty....cannot enqueue");
        return -1;
    }

    public void show() {
        if (getSize() == 0)
            System.out.println("Queue is Empty....");
        else {
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
        }
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return size;
    }

    private boolean isFull() {
        return getSize() == getCapacity();
    }

    private int getCapacity() {
        return capacity;
    }
}
