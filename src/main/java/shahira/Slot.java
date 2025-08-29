package shahira;

public class Slot {
    private int slotId;
    private int slotNumber;
    private boolean isOccupied;

    public Slot(int slotId, int slotNumber, boolean isOccupied) {
        this.slotId = slotId;
        this.slotNumber = slotNumber;
        this.isOccupied = isOccupied;
    }

    public String toString() {
        return "Slot ID: " + slotId + ", Number: " + slotNumber + ", Occupied: " + isOccupied;
    }
}
