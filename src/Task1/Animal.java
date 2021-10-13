package Task1;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(){}

    public Animal(final boolean veg, final String food, final int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(final boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(final String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(final int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    static {
        System.out.println("Static block");
    }
}
