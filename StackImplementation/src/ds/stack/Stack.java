package ds.stack;

public class Stack {
    private final int maxSize;
    private final char[] stackArray;
    private int top;

    public Stack(int size){
      this.maxSize = size;
      this.stackArray = new char[maxSize];
      this.top = -1;
    }

    public void push(char j){
        if(!isFull()) {
            top++;
            stackArray[top] = j;
        } else {
            System.out.println("The stack is full");
        }
    }

    public char pop(){
        if(isEmpty()) {
            System.out.println("The stack is empty");
            return '0';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return maxSize - 1 == top;
    }
}
