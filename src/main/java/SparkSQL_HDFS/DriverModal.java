package SparkSQL_HDFS;

public class DriverModal {

    private String driverId;
    private String forename;
    private String surname;
    private String nationality;

    public DriverModal() {
    }

    public DriverModal(String driverId, String forename, String surname, String nationality) {
        this.driverId = driverId;
        this.forename = forename;
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
