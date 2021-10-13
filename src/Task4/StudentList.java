package Task4;

import java.util.*;

import static java.util.Collections.addAll;

public class StudentList {
    private final List<Student> students;
    private final List<String> subjects;
    private final HashMap<String, HashMap<String, Integer>> map;

    public StudentList(final String[] subjects) {
        this.subjects = new ArrayList<>();
        this.students = new ArrayList<>();
        addAll(this.subjects, subjects);
        this.map = new HashMap<>();
        for (final String subject : subjects) {
            this.map.put(subject, new HashMap<>());
        }
    }

    public void addStudent(final Student student) {
        students.add(student);
    }

    public void addSubject(final String subject) {
        subjects.add(subject);
    }

    public void setMark(final String subject, final String id, final int mark) {
        final HashMap<String, Integer> inner1 = map.computeIfAbsent(subject, k -> new HashMap<>());
        inner1.put(id, mark);
    }

    public int getMark(final String subject, final String id) {
        final HashMap<String, Integer> inner1 = map.computeIfAbsent(subject, k -> new HashMap<>());
        final Integer mark = inner1.get(id);
        if (mark == null) {
            return 0;
        }
        return mark;
    }

    public Map<String, Integer> getMarks(final String subject) {
        return map.get(subject);
    }

    public void infoAllStudents() {
        for(final Student student: students) {
            System.out.print(student.getId() + "| Name: "+ student.getName()+ ", Surname: " + student.getSurname()+", Age: " + student.getAge()+ ", Group: " +student.getGroup()+ ". Subject: ");
            subjects.stream().map(subject -> subject + " = " + getMark(subject, student.getId()) + " | ").forEach(System.out::print);
            System.out.println();
        }
    }

    private int getMarksSum(final String id) {
        int result = 0;
        for (final String subject : subjects) {
            result += getMark(subject, id);
        }
        return result;
    }
    public String getHighestAverageId() {
        int currentMax=-1;
        int currentSum;
        Student HighestScore = null;

        for (final Student student : students) {
            currentSum = getMarksSum(student.getId());
            if (currentSum > currentMax) {
                currentMax = currentSum;
                HighestScore = student;
            }
        }
        return Objects.requireNonNull(HighestScore).getId();
    }

    public void getHighestAverage() {
        final String HighestScoreId = getHighestAverageId();
        System.out.print(HighestScoreId + "| ");
        subjects.stream().map(subject -> subject + " = " + getMark(subject, HighestScoreId) + " | ").forEach(System.out::print);
        System.out.println();
    }
}
