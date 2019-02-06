public class Vehicle {
    private  String name;
    private double tankCapacity;
    private double averageBurn;

    public Vehicle(String name, double tankCapacity, double averageBurn) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageBurn = averageBurn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageBurn() {
        return averageBurn;
    }

    public void setAverageBurn(double averageBurn) {
        this.averageBurn = averageBurn;
    }
}
