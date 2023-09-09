package NeetCode.Arrays;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public void push(int n){
        stack.add(n);
    }

    public int pop(){
        if(!stack.isEmpty())
            return stack.remove(stack.size()-1);

        return -999;
    }

    public void peek(){
        if(!stack.isEmpty()) 
            System.out.println(stack.indexOf(0));
    }
}
