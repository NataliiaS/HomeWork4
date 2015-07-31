package sourseit.HomeWork.Sydorenko.HomeWork4;

public class FullStackException extends Exception
{

    FullStackException (){}
    public String toString(){
        return "FullStackException[" + "Cannot add to full stack" + "]";
    }
}
