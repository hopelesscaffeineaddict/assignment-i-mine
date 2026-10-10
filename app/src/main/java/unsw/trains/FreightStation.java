package unsw.trains;

import unsw.utils.Position;

public class FreightStation extends Station {
    // Creates empty freight station
    // private int numberOfFreight;
    public FreightStation(String stationId, Position position) {
        super(stationId, "FreightStation", position, 3);

        // if (numberOfFreight < 0) {
        //     throw new IllegalArgumentException("Number of freight cannot be negative");
        // }

        // this.numberOfFreight = numberOfFreight;
    }

    // public int getNumberOfFreight() {
        // return numberOfFreight;
    // }
}
