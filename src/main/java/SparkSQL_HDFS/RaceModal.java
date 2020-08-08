package SparkSQL_HDFS;

public class RaceModal {
    private String raceId;
    private String grandPrix;

    public RaceModal() {
    }

    public RaceModal(String raceId, String grandPrix) {
        this.raceId = raceId;
        this.grandPrix = grandPrix;
    }

    public String getRaceId() {
        return raceId;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    public String getGrandPrix() {
        return grandPrix;
    }

    public void setGrandPrix(String grandPrix) {
        this.grandPrix = grandPrix;
    }
}
