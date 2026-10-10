package unsw.trains;

import unsw.utils.Position;

public class PassengerStation extends Station {
    // Creates empty passenger station
    // private int numberOfPassengers;
    public PassengerStation(String stationId, Position position) {
        super(stationId, "PassengerStation", position, 4);

        // if (numberOfPassengers < 0) {
            // throw new IllegalArgumentException("Number of passengers cannot be negative");
        // }

        // this.numberOfPassengers = numberOfPassengers;
    }

    // public int getNumberOfPassengers() {
        // return numberOfPassengers;
    // }
}
