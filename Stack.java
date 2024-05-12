package stack;

import java.util.EmptyStackException;

class StackImplementation{
    //LIFO implementation
    class Node{
        Object ele;
        Node next;
        Node(Object e, Node n){
            ele = e;
            next = n;
        }
    }
    private int count = 0;
    Node first = null;

    public void push(Object e){
        first = new Node(e,first);
        count++;
    }
    public int size(){
        return count;
    }
    public Object peak(){
        if (first == null)
            throw new EmptyStackException();
        return first.ele;
    }
    public boolean isempty(){
        if (count == 0)
            return true;
        return false;
    }
    public Object pop(){
        if (first == null)
            throw new EmptyStackException();
        Object temp = first.ele;
        first = first.next;
        count--;
        return temp;
    }
}
public class Stack {
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.size());
        s.push(50);
        System.out.println(s.peak());
        System.out.println(s.pop());
        System.out.println(s.isempty());
        System.out.println(s.size());
        while (!s.isempty()){
            System.out.println(s.pop());
        }
    }
}
