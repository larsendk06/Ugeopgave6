public class Rabbit extends Animal {

    public Rabbit(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return 4;
    }

    @Override
    public String toString() {
        return "Rabbit \"" + getName() + "\" (energi: " + getEnergy() + ")";
    }
}