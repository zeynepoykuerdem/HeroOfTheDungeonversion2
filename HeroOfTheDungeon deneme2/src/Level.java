import java.util.ArrayList;
public class Level {
    private int levelNumber;
    private ArrayList<Room> rooms;

    public Level(int levelNumber, ArrayList<Room> rooms) {
        this.levelNumber = levelNumber;
        this.rooms = rooms;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

}
