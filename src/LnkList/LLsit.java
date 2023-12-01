package LnkList;

class Node{
    int value;
    double percentage;
    Node next;

    Node(int value, double value2){
        this.value = value;
        this.percentage = value2;
    }
}

class LinkedList{
    Node head = null;
    void insertValueAtEnd(int value, double percentage){
        Node newNode = new Node(value, percentage);
        if(head == null){
            head = newNode;
        }
        else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.value+" "+curr.percentage+" | ");
            curr = curr.next;
        }
    }
}

public class LLsit {
    public static void main(String[] args) {
         LinkedList li = new LinkedList();
         li.insertValueAtEnd(10, 1.1);
         li.insertValueAtEnd(20, 2.2);
         li.insertValueAtEnd(30, 3.3);
         li.print();



        // Printing linkedlist

    }
}
