package Task3;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String group;
    private final Mark mark;
    private final Subject subject;

    public Student(final String name, final String surname, final int age, final String group, final Mark mark, final Subject subject) {
        if(name!=null){
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
        if(surname!=null){
            this.surname = surname;
        } else {
            System.out.println("Invalid surname");
        }
        if(age > 0 && age < 100){
           this.age = age;
        } else {
            System.out.println("Invalid age of " + name + " " + surname);
        }
        if(group!=null){
            this.group = group;
        } else {
            System.out.println("Invalid group");
        }
        this.mark=mark;
        this.subject=subject;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (name!=null) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        if(surname!=null){
            this.surname = surname;
        } else {
            System.out.println("Invalid surname");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        if(age > 0 && age < 100){
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        if(group!=null){
            this.group = group;
        } else {
            System.out.println("Invalid group");
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                ", subject=" + subject +
                '}';
    }
}