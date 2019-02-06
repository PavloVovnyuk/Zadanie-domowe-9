public class Car extends Vehicle {
    private boolean condIsOn;

    public Car(String name, double tankCapacity, double averageBurn, boolean condIsOn) {
        super (name, tankCapacity, averageBurn);
        this.condIsOn = condIsOn;
    }

    boolean turnOnCond() {
        condIsOn = false;
        return condIsOn;
    }

    void shovInfo() {
        System.out.println ("Nazwa samochodu " + getName () + " Pojemność baku " + getTankCapacity () + " Spałanie na 100 km " + getAverageBurn ());
    }

    double calculate() {
        double avarageWithCondition = (0.8 + getAverageBurn ());
        return avarageWithCondition;
    }
}
