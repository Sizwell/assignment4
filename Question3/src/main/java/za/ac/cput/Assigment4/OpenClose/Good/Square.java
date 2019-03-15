package za.ac.cput.Assigment4.OpenClose.Good;

public class Square implements Shapes{

    private int length;
    private int breath;

    @Override
    public int calculateArea() {
        return length * breath;
    }

}
