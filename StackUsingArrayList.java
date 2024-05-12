package stack;

import java.util.EmptyStackException;

class StackImp{
    private Object []arr = new Object[5];
    private int count = 0;

    public void increasearraysize(){
        Object [] temp = new Object[arr.length + 3];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;
    }
    public void push(Object e){
        if (count>=arr.length)
            increasearraysize();
        arr[count] = e;
        count++;
    }
    public int size(){
        return count;
    }
    public Object peak(){
        if (arr[0] == null)
            throw new EmptyStackException();
        return arr[count];
    }
    public boolean isempty(){
        if (count == 0)
            return true;
        return false;
    }
    public Object pop(){
        if (arr[0] == null)
            throw new EmptyStackException();
        Object temp = arr[count];
        arr[count] = null;
        count--;
        return temp;
    }
}
public class StackUsingArrayList {
    public static void main(String[] args) {
        StackImp i = new StackImp();
        i.push(10);
        i.push(20);
        i.push(30);
        i.push(40);
        i.push(50);
        i.push(60);
        System.out.println(i.size());
        System.out.println(i.isempty());
        System.out.println(i.peak());
        while (! i.isempty()){
            System.out.println(i.pop());
        }
    }
}
