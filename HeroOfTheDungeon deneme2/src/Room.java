import java.util.ArrayList;
import java.util.Random;

public class Room {
    private int roomID;
    private ArrayList<Door> doors;
    private ArrayList<Stair> stairs;
    int numofmon;
    Monster newRandomMonster;

    public Room(int roomID, ArrayList<Door> doors, ArrayList<Stair>  stairs,int numofmon,Monster newRandomMonster) {
        this.roomID = roomID;
        this.doors = doors;
        this.stairs = stairs;
        this.numofmon = numofmon;
        this.newRandomMonster= newRandomMonster;
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

    public int getNumofmon() {
        return numofmon;
    }

    public void setNumofmon(int numofmon) {
        this.numofmon = numofmon;
    }

    public Monster getNewRandomMonster() {
        return newRandomMonster;
    }

    public void setNewRandomMonster(Monster newRandomMonster) {
        this.newRandomMonster = newRandomMonster;
    }
}
