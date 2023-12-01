package DoubelL;

class Node{
    int value;
    Node next;
    Node prev;

    Node(int value){
        this.value = value;
    }
}

class doublLinkList{
    private Node head;
    private Node tail;
    private int length;

    public doublLinkList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }




    public void getHead(){
        System.out.println("head : "+head.value);
    }
    public void getTail(){
        System.out.println("tail : "+tail.value);
    }
    public void getLength(){
        System.out.println("length : "+length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLst(){
        if(length == 0){
            return null;
        }
        Node temp = tail;

        if(length == 1){
            head = null;
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DList {
    public static void main(String[] args) {
        doublLinkList mydll = new doublLinkList(4);



        mydll.append(5);
//        System.out.println();
//        mydll.getHead();
//        mydll.getTail();
//        mydll.removeLst();
        mydll.prepend(9);
        mydll.print();
    }
}
