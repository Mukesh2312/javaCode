package Queue;

import java.util.Arrays;

class QueueArray{
    int[] arr;
    int size;
    int rear = 0;
    int front = 0;
    QueueArray(int capacity ){
        size = capacity;
        arr = new int[size];

    }

    void enqueue(int num){
        if(rear == arr.length){
            System.out.println("Queue if full.");

        }
        else{
            arr[rear] = num;
            rear++;
        }

    }
    void dequeue(){
        if(front == rear){
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Removing "+ arr[front]);
            front++;
        }

    }
}

public class QueueTest {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(Arrays.toString(q.arr));


    }
}
