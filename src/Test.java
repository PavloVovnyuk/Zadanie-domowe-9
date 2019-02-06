public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car ("BMW", 40, 15, false);
        cars[1] = new Car ("Audi", 35, 13, false);
        cars[2] = new Truck ("Volvo", 90, 35, false, 5000);
        double newBurn = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                cars[i].shovInfo ();
                if (cars[i].turnOnCond ()) {
                    cars[i].calculate ();
                    newBurn = cars[i].calculate ();
                    System.out.println ("Spałanie przy włącznej klimatyzacji wynosi " + newBurn);

                }
            }
        }
    }
}