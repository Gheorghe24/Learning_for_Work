package ds.queue;

public class Queue {
    private final int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){
        if(rear == maxSize - 1) {
            rear =- 1;
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public long remove(){
        long temp = queArray[front];
        front++;
        if(front == maxSize) {
            front = 0; //
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public void view(){
        System.out.println("Printed queue");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
    }
}
