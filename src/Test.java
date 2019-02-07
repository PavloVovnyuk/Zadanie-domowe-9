public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car ("BMW", 40, 10, false);
        cars[1] = new Car ("Audi", 35, 13, false);
        cars[2] = new Truck ("Volvo", 40, 10, false, 5000);
        double newRange = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                cars[i].shovInfo ();
                newRange = cars[i].calculateRange ();
                System.out.println ("Zasieng wynosi " + newRange + " km");
            }
        }
    }
}