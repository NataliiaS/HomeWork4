package sourseit.HomeWork.Sydorenko.HomeWork4;

import java.util.EmptyStackException;

public interface Stack {

        void push(Object o) throws FullStackException;

        Object pop() throws EmptyStackException;

        void clear();

        void print();

    }

