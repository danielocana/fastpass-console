package demo.fastpassconsole;

public class Toll {
    private String stationId;
    private String customerId;
    private String timestamp;

    public Toll() {
    }

    public Toll(String stationId, String customerId, String timestamp) {
        this.stationId = stationId;
        this.customerId = customerId;
        this.timestamp = timestamp;
    }

    public String getStationId() {
        return stationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
