package demo;

public class Flower {

    private String name;

    public Rock pet;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "I'm a flower and my name is " + this.name;
    }
}
