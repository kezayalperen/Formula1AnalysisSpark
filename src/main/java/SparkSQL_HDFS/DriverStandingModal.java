package SparkSQL_HDFS;

public class DriverStandingModal {
    private int points;
    private int position;
    private int raceId;
    private String driverId;

    public DriverStandingModal() {
    }

    public DriverStandingModal(int points, int position, int raceId, String driverId) {
        this.points = points;
        this.position = position;
        this.raceId = raceId;
        this.driverId = driverId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
