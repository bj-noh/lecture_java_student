package assignment6_04;

import java.util.NoSuchElementException;

public class ArrayQueue {
	private int[] arr; // queue에 저장될 데이터를 저장하는 array. array의 사이즈는 capacity가 결정
    private int front; // 가장 상위에 있는 데이터를 가르키는 index. 0으로 초기화되며, 대기열(queue)의 값이 삭제(dequeue)될 때마다 업데이트 됨.
    private int rear;  // 가장 마지막에 있는 데이터를 가르키는 index. -1로 초기화되며, 새로운 element가 대기열(queue)에 추가(enqueue)될 때 마다 업데이트 됨.
    private int size;  // 현재 대기열(queue)에 있는 데이터의 수를 나타내는 값. 0으로 초기화되며, element가 추가(enqueue)되면 증가하고, 해제(dequeue)되면 감소함

    public ArrayQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) { // 대기열(queue)에 값을 추가(enqueue)하는 메소드
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue more elements.");
            return;
        }
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
        
    }

    public int dequeue() { // 대기열(queue)에 값을 삭제(dequeue)하는 메소드
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue.");
        }
        
        int element;
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
        
        return element;
    }

    public int peek() { // 대기열(queue)의 가장 먼저 있는 값을 보여주는 메소드 (구현 완료)
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot peek.");
        }
        return arr[front];
    }

    public boolean isEmpty() { // 대기열(queue)이 비어있는지 검사하는 메소드
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }

    public boolean isFull() { // 대기열(queue)이 가득찼는지 검사하는 메소드
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }

    public int size() { // 대기열(queue) 내 현재 데이터의 수(size)를 반환하는 메소드
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }
    
    public void printCurrentQueueStatus(String operation) { // 현재 대기열(queue) 내 데이터를 출력하는 메소드
        System.out.print("Current Queue after " + operation + " operation: [");
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
        
        System.out.println("]");
    }

}
