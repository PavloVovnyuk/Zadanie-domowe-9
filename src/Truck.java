public class Truck extends Car {
    private double weightOfLoad;

    public Truck(String name, double tankCapacity, double averageBurn, boolean condIsOn, double weightOfLoad) {
        super (name, tankCapacity, averageBurn, condIsOn);
        this.weightOfLoad = weightOfLoad;
    }

    public double getWeightOfLoad() {
        return weightOfLoad;
    }

    public void setWeightOfLoad(double weightOfLoad) {
        this.weightOfLoad = weightOfLoad;
    }

    void shovInfo() {
        System.out.println ("Nazwa samochodu " + getName () + " Pojemność baku " + getTankCapacity () + " Spałanie na 100 km " + getAverageBurn () + " Waga ładunku wynosi " + getWeightOfLoad ());
    }


    double calculateRange() {
        double range = 0;
        if (condIsOn) {
            range = (100 / (getAverageBurn () + 1.6) * getTankCapacity ()) + (weightOfLoad / 100 * 0.5);
        } else {
            range = (100 / getAverageBurn () * getTankCapacity ()) + (weightOfLoad / 100 * 0.5);

        }
        return range;
    }
}