package unsw.trains;

import unsw.utils.Position;
import java.util.ArrayList;
import java.util.List;

import unsw.exceptions.InvalidRouteException;
import unsw.response.models.*;

/**
 * The controller for the Trains system.
 *
 * The method signatures here are provided for you. Do NOT change the method signatures.
 */
public class TrainsController {
    private ArrayList<Station> stations = new ArrayList<Station>();
    // Add any fields here if necessary
    public void createStation(String stationId, String type, double x, double y) {
        // Todo: Task ai
        Position position = new Position(x, y);

        switch (type) {
            case "PassengerStation" :
                stations.add(new PassengerStation(stationId, position));
                break;
            case "FreightStation" :
                stations.add(new FreightStation(stationId, position));
                break;
            case "CentralStation" :
                stations.add(new CentralStation(stationId, position));
                break;
            case "SupplyStation" : 
                stations.add(new SupplyStation(stationId, position));
                break;
            default :
                break;

        // Station station = new Station(stationId);
        // stations.add(station);
    }

    public void createTrack(String trackId, String fromStationId, String toStationId) {
        // Todo: Task aii
    }

    public void createTrain(String trainId, String type, String stationId, List<String> route)
            throws InvalidRouteException {
        // Todo: Task aiii
    }

    public List<String> listStationIds() {
        // Todo: Task aiv
        return new ArrayList<>();
    }

    public List<String> listTrackIds() {
        // Todo: Task av
        return new ArrayList<>();
    }

    public List<String> listTrainIds() {
        // Todo: Task avi
        return new ArrayList<>();
    }

    public TrainInfoResponse getTrainInfo(String trainId) {
        // Todo: Task avii
        return null;
    }

    public StationInfoResponse getStationInfo(String stationId) {
        // Todo: Task aviii
        return null;
    }

    public TrackInfoResponse getTrackInfo(String trackId) {
        // Todo: Task aix
        return null;
    }

    public void simulate() {
        // Todo: Task bi
    }

    /**
     * Simulate for the specified number of minutes. You should NOT modify
     * this function.
     */
    public void simulate(int numberOfMinutes) {
        for (int i = 0; i < numberOfMinutes; i++) {
            simulate();
        }
    }

    public void createPassenger(String startStationId, String destStationId, String passengerId) {
        // Todo: Task bii
    }

    public void createFreight(String startStationId, String destStationId, String freightId, int weight) {
        // Todo: Task bii
    }

    public void createRefrigeratedFreight(String startStationId, String destStationId, String freightId, int weight,
            int minsTillSpoil) {
        // Todo: Task biii
    }

    public void createTrack(String trackId, String fromStationId, String toStationId, boolean isBreakable) {
        // Todo: Task ci
    }

    public void createPassenger(String startStationId, String destStationId, String passengerId, boolean isTechnician) {
        // Todo: Task cii
    }
}
