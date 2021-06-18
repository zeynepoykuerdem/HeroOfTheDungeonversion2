public class Door {
    private int doorNumber;
    private Room targetRoom;

    public Door(int doorNumber, Room targetRoom) {
        this.doorNumber = doorNumber;
        this.targetRoom = targetRoom;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Room getTargetRoom() {
        return targetRoom;
    }

    public void setTargetRoom(Room targetRoom) {
        this.targetRoom = targetRoom;
    }
}
