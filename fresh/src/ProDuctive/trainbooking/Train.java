package ProDuctive.trainbooking;

import java.time.LocalDate;

public class Train {
    private  int trainNumber;
    private String trainName;
    private String fromStation;
    private int seatsAvailable;
    private  String toStation;
    private int fare;
    private LocalDate doj;

    public Train() {}

    public Train(int trainNumber, String trainName, String fromStation, String toStation, int seatsAvailable, int fare, LocalDate doj) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.fromStation = fromStation;
        this.seatsAvailable = seatsAvailable;
        this.toStation = toStation;
        this.fare = fare;
        this.doj = doj;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }
}
