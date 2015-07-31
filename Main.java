package sourseit.HomeWork.Sydorenko.HomeWork4;

import java.util.EmptyStackException;

public class Main
{
    public static void main(String[] args)
    {

        StackDemo st = new StackDemo(5);
        try
        {
            st.push(7);
            st.print();
            st.push(27);
            st.push(37);
            st.push(47);
            st.print();
            st.pop();
            st.pop();
            st.print();
            st.push(72);
            st.push(272);
            st.push(372);
//            st.push(472);
            st.print();
            st.clear();
            st.push(25);
            st.print();
            st.pop();

        }
        catch (FullStackException e){
            System.out.println("Stack is full");
        }
        catch (EmptyStackException e){
            System.out.println("Stack is empty");
        }



    }
}
