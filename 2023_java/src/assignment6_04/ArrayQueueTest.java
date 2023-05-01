package assignment6_04;

public class ArrayQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 array를 활용하여 정수형 데이터를 저장하는 queue를 구현한 것이다.
		 * 
		 * queue는 대표적인 자료구조 중 하나로, first-in, first-out의 형태를 갖는다. (은행, 식당 대기표 등)
		 * queue 대기열에 데이터를 추가하는 과정을 enqueue라고 하며, 대기열에서 데이터를 삭제하는 과정을 dequeue라고 한다. 
		 * 예를 들어, queue의 사이즈(capacity)가 5이고, 1, 2, 3, 4, 5와 같은 데이터를 입력하고자 할 때, 
		 * enqueue(1), enqueue(2), enqueue(3), enqueue(4), enqueue(5)와 같은 방식으로 입력되며, 
		 * 데이터는 앞에서 부터 순차적으로 1, 2, 3, 4, 5와 같이 저장된다.
		 * 값을 삭제할 때는 dequeue() 메소드를 호출하며, 한 번 호출 할 때마다, 1, 2, 3, 4, 5가 순서대로 삭제된다.
		 * 값의 삭제 없이 현재 queue 대기열에 가장 앞에 있는 값을 출력할 때에는 peek() 메소드를 호출한다. 	 
		 * 
		 * 예시) 
		 *	Current Queue after enqueue() operation: [10]
			Current Queue after enqueue() operation: [10, 20]
			Current Queue after enqueue() operation: [10, 20, 30]
			Current Queue after enqueue() operation: [10, 20, 30, 40]
			Current Queue after enqueue() operation: [10, 20, 30, 40, 50]
			Current Queue after dequeue() operation: [20, 30, 40, 50]
			Current Queue after dequeue() operation: [30, 40, 50]
			Current Queue after enqueue() operation: [30, 40, 50, 60]
			Current Queue after enqueue() operation: [30, 40, 50, 60, 70]
			Peek: 30
			Current Queue after peek() operation: [30, 40, 50, 60, 70]
			Current Queue after dequeue() operation: [40, 50, 60, 70]
			Current Queue after dequeue() operation: [50, 60, 70]
			Current Queue after dequeue() operation: [60, 70]
			Current Queue after dequeue() operation: [70]
			Current Queue after dequeue() operation: []
		 */
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.printCurrentQueueStatus("enqueue()");
        queue.enqueue(20);
        queue.printCurrentQueueStatus("enqueue()");
        queue.enqueue(30);
        queue.printCurrentQueueStatus("enqueue()");
        queue.enqueue(40);
        queue.printCurrentQueueStatus("enqueue()");
        queue.enqueue(50);
        queue.printCurrentQueueStatus("enqueue()");
        
        queue.dequeue();
        queue.printCurrentQueueStatus("dequeue()");
        queue.dequeue();
        queue.printCurrentQueueStatus("dequeue()");
        
        queue.enqueue(60);
        queue.printCurrentQueueStatus("enqueue()");
        queue.enqueue(70);
        queue.printCurrentQueueStatus("enqueue()");
        
        System.out.println("Peek: " + queue.peek());   

        queue.printCurrentQueueStatus("peek()");

        while (!queue.isEmpty()) {
            queue.dequeue();
            queue.printCurrentQueueStatus("dequeue()");
        }        
	}
}
