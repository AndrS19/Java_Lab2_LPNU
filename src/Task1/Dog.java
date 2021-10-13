package Task1;

public class Dog extends Animal{
    private String color;

    public Dog(final boolean veg, final String food, final int legs) {
        super(veg, food, legs);
        this.color="Black";
    }

    public Dog(final boolean veg, final String food, final int legs, final String color){
        super(veg, food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    static {
        System.out.println("Dog static block");
    }
}