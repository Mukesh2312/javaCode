package SL1;

class Node{
    int value;
    Node next;

    Node(int val){
        this.value = val;
    }
}

class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removelast(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        Node prev = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
}
public class SingleLinkList {
    public static void main(String[] args) {
        LinkedList Li = new LinkedList(4);
        Li.append(22);

        System.out.println(Li.removelast().value);
        System.out.println(Li.removelast().value);
        System.out.println(Li.removelast());



    }
}
