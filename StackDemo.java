package sourseit.HomeWork.Sydorenko.HomeWork4;

import java.util.EmptyStackException;
import java.util.Objects;

public class StackDemo implements Stack
{
    private int size;
    private Object [] array;
    private int top;

    public StackDemo (int capacity){
        size = capacity;
        array = new Object[size];
        top = -1;
    }

    @Override
    public void push(Object o) throws FullStackException
    {
        if (top==array.length-1) {
                throw new FullStackException();
            }
        array[++top] = o;
    }

    @Override
    public Object pop() throws EmptyStackException
    {
        if (top==0){
                throw new EmptyStackException();
            }
        return array[top--] = null;
    }

    @Override
    public void clear()
    {
        top = -1;
        for (int i= 0; i < array.length; i++){
            array[i] = null;
        }
    }

    @Override
    public void print()
    {
        for (int i= 0; i < array.length; i++){
            System.out.print(array[i] + " ");}
        System.out.println();
    }

}
