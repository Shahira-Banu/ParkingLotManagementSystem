package shahira;

public class Vehicle {
    private int id;
    private String vehicleNo;
    private String ownerName;
    private String vehicleType;
    private int parkingSlot;

    public Vehicle(int id, String vehicleNo, String ownerName, String vehicleType, int parkingSlot) {
        this.id = id;
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
    }

    public String toString() {
        return "ID: " + id + ", Vehicle No: " + vehicleNo + ", Owner: " + ownerName +
               ", Type: " + vehicleType + ", Slot: " + parkingSlot;
    }
}
