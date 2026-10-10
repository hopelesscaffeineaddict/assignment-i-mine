package unsw.trains;
 
import unsw.utils.Position;
import org.json.JSONArray;

public abstract class Station {
    private String stationId;
    private String type;
    private Position position;
    private int maxTrains;

    // Constructpr
    public Station(String stationId, String type, Position position, int maxTrains) {
        this.stationId = stationId;
        this.type = type;
        this.position = position;
        this.maxTrains = maxTrains;
    }

    // Getters 
    public String getStationId() {
        return stationId;
    }

    public String getStationType() {
        return type;
    }

    // Getters
    public Position getPosition() {
        return position;
    }

    // Getters
    public int getMaxTrains() {
        return maxTrains;
    }

    // Setter for Max Trains
    public void setMaxTrains(int maxTrains) {
        this.maxTrains = maxTrains;
    }
}