import java.util.ArrayList;
public class Room {
    private int roomID;
    private ArrayList<Door> doors;
    private ArrayList<Stair> stairs;

    public Room(int roomID, ArrayList<Door> doors, ArrayList<Stair>  stairs) {
        this.roomID = roomID;
        this.doors = doors;
        this.stairs = stairs;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public ArrayList<Stair> getStairs() {
        return stairs;
    }

    public void setStairs(ArrayList<Stair> stairs) {
        this.stairs = stairs;
    }
}
