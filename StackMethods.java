package sourseit.HomeWork.Sydorenko.HomeWork4;

import java.util.EmptyStackException;

/**
 * Created by Natasha on 12.09.2015.
 */
public class StackMethods implements Stack
{
    private int size;
    private Object [] array;
    private int top;

    public StackMethods (int capacity){
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
        if (top==-1){
            throw new EmptyStackException();
        }
        return array[top--];
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
