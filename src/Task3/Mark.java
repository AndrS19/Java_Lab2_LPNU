package Task3;

public class Mark {
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(final int mark) {
        if(mark >= 1 && mark <= 5){
            this.mark = mark;
        } else {
            System.out.println("Invalid mark");
        }
    }

    public Mark(final int mark) {
        if(mark >= 1 && mark <= 5){
            this.mark = mark;
        } else {
            System.out.println("Invalid mark " + mark);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}