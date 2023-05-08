package assignment06_04_answer;

import java.util.NoSuchElementException;

public class ArrayQueue {
	private int[] arr; // queue에 저장될 데이터를 저장하는 array. array의 사이즈는 capacity가 결정
    private int front; // 가장 상위에 있는 데이터를 가르키는 index. 0으로 초기화되며, 대기열(queue)의 값이 해제(dequeue)될 때마다 업데이트 됨.
    private int rear;  // 가장 마지막에 있는 데이터를 가르키는 index. -1로 초기화되며, 새로운 element가 대기열(queue)에 추가(enqueue)될 때 마다 업데이트 됨.
    private int size;  // 현재 대기열(queue)에 있는 데이터의 수를 나타내는 값. 0으로 초기화되며, element가 추가(enqueue)되면 증가하고, 해제(dequeue)되면 감소함

    public ArrayQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue more elements.");
            return;
        }
        
        rear = (rear + 1) % arr.length;
        arr[rear] = element;
        size++;
        
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue.");
        }
        int element = arr[front];
        front = (front + 1) % arr.length;
        size--;
        
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot peek.");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }
    
    public void printCurrentQueueStatus(String operation) {
        System.out.print("Current Queue after " + operation + " operation: [");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length;
            System.out.print(arr[index]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
