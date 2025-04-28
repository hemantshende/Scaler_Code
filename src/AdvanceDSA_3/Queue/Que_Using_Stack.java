package AdvanceDSA_3.Queue;

import java.util.Stack;

public class Que_Using_Stack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void enqueue(int val){
        stack1.push(val);
    }
    public int dequeue(){
        if(stack2.isEmpty()==false){
            return stack2.pop();
        }
        if(stack2.isEmpty()){
            while(stack1.isEmpty()==false){
                stack2.push(stack1.pop());
            }
            if(stack2.isEmpty()){
                System.out.println("stack is empty");
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        Que_Using_Stack q=new Que_Using_Stack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue()); // 1
        System.out.println(q.dequeue()); // 2

        q.enqueue(4);

        System.out.println(q.dequeue()); // 3
        System.out.println(q.dequeue()); // 4
    }
}
