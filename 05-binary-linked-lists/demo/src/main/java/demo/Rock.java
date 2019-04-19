package demo;

public class Rock {

    private String name;

    public int numOfDiamonds = 0;

    public Rock(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "ROCK! " + this.name.toUpperCase();
    }
}
