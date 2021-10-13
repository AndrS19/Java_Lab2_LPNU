package Task4;

    public class Main {

        public static void main(final String[] args) {
            final StudentList studentList = new StudentList(new String[]{"Physics", "Math", "English"});
            final Student student1 = new Student("1", "Andrii", "Jonson", 19, "IT-13");
            final Student student2 = new Student("2","Roman", "Jonson", 21, "IT-33");
            final Student student3 = new Student("3","Tom", "Jonson", 20, "IT-21");

            studentList.addStudent(student1);
            studentList.addStudent(student2);
            studentList.addStudent(student3);

            studentList.addSubject("Database");

            studentList.setMark("English", "1", 5);
            studentList.setMark("English", "2", 4);
            studentList.setMark("English", "3", 3);
            studentList.setMark("Math", "1", 5);
            studentList.setMark("Math", "2", 3);
            studentList.setMark("Math", "3", 4);
            studentList.setMark("Physics", "1", 4);
            studentList.setMark("Physics", "2", 3);
            studentList.setMark("Physics", "3", 3);
            studentList.setMark("Database", "1", 5);
            studentList.setMark("Database", "2", 4);
            studentList.setMark("Database", "3", 5);

            studentList.infoAllStudents();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Highest average score: ");
            studentList.getHighestAverage();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Math map: ");
            System.out.println(studentList.getMarks("Math"));
        }
    }