package Stack;

class StackArray{
    int top = -1;
    int[] arr;
    int size;

    //constructor

    StackArray(int size){
        arr = new int[size];
        this.size = size;
    }
    void push(int num){
        if(top+1 < 0){
            System.out.println("Stack is full");
        }
        else {
            top++;
            arr[top] = num;

        }

    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Removing " + arr[top]);
            top--;
        }

    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");

        }
        else{
            System.out.println(arr[top]);

        }
    }
}

public class Stck {
    public static void main(String[] args) {
        StackArray myStack = new StackArray(4);
//        myStack.push(55);
//        myStack.push(1);
//        myStack.push(99);
//        myStack.push(43);
        myStack.peek();


    }
}
