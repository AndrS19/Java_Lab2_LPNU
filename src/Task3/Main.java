package Task3;

public class Main {
    public static void main(final String[] args)
    {
        final Subject subject = new Subject("Database");
        final Subject subject1 = new Subject("Math");
        final Subject subject2 = new Subject("Application programming");

        final Mark mark = new Mark(0);
        final Mark mark1 = new Mark(1);
        final Mark mark2 = new Mark(2);
        final Mark mark3 = new Mark(3);
        final Mark mark4 = new Mark(4);
        final Mark mark5 = new Mark(5);

        final Student student = new Student("Andrii", "Jonson", 19, "IT-13",mark5,subject);
        final Student student1 = new Student("Roman", "Jonson", 21, "IT-33",mark3,subject2);
        final Student student2 = new Student("Tom", "Jonson", 20, "IT-21",mark,subject1);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
    }
}