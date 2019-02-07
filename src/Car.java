public class Car extends Vehicle {
    protected boolean condIsOn;

    public Car(String name, double tankCapacity, double averageBurn, boolean condIsOn) {
        super (name, tankCapacity, averageBurn);
        this.condIsOn = condIsOn;
    }

    void shovInfo() {
        System.out.println ("Nazwa samochodu " + getName () + " Pojemność baku " + getTankCapacity () + " Spałanie na 100 km " + getAverageBurn ());
    }

    double calculateRange() {
        double range = 0;
        if (condIsOn) {
            range = 100 / (getAverageBurn () + 0.8) * getTankCapacity ();
        } else {
            range = 100 / getAverageBurn () * getTankCapacity ();
        }
        return range;
    }
}

