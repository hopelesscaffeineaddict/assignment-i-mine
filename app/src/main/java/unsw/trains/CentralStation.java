package unsw.trains;

import unsw.utils.Position;

public class CentralStation extends Station {
    // Creates empty central station
    // private int numberOfFreight;
    // private int numberOfPassengers;

    public CentralStation(String stationId, Position position) {
        super(stationId, "CentralStation", position, 8);

        // if (numberOfPassengers < 0) {
            // throw new IllegalArgumentException("Number of passengers cannot be negative");
        // }

        // if (numberOfFreight < 0) {
            // throw new IllegalArgumentException("Number of freight cannot be negative");
        // }

        // this.numberOfPassengers = numberOfPassengers;
        // this.numberOfFreight = numberOfFreight;
    }

    // public int getNumberOfFreight() {
        // return numberOfFreight;
    // }

    // public int getNumberOfPassengers() {
        // return numberOfPassengers;
    // }
}
