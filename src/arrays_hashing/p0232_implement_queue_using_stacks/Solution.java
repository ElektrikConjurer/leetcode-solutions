package arrays_hashing.p0232_implement_queue_using_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    Deque<Integer> firstStack;
    Deque<Integer> secondStack;

    public MyQueue() {
        this.firstStack = new ArrayDeque<>();
        this.secondStack = new ArrayDeque<>();
    }

    public void push(int x) {
        secondStack.push(x);
    }

    public int pop() {
        if (firstStack.isEmpty()) {
            while (!secondStack.isEmpty()) {
                firstStack.push(secondStack.pop());
            }
        }

        return firstStack.pop();
    }

    public int peek() {
        if (firstStack.isEmpty()) {
            while (!secondStack.isEmpty()) {
                firstStack.push(secondStack.pop());
            }
        }

        return firstStack.peek();
    }

    public boolean empty() {
        return secondStack.isEmpty() && firstStack.isEmpty();
    }


}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */