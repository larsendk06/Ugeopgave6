public class Lion extends Animal {

    public Lion(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return 15;
    }

    @Override
    public String toString() {
        return "Lion \"" + getName() + "\" (energi: " + getEnergy() + ")";
    }
}
