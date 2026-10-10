package unsw.trains;

import unsw.utils.Position;

public class SupplyStation extends Station {
    // Creates empty supply station
    public SupplyStation(String stationId, Position position) {
        super(stationId, "SupplyStation", position, 6);
    }
}
