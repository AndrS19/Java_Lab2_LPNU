package Task2;

public class Main {
    public static void main(final String[] args)
    {
        final Stack obj = new Stack();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();
        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
