import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static final Scanner USERINPUT = new Scanner(System.in);
    public static final Random RAND = new Random();
    public static void main(String[]args){ Scanner scanner=new Scanner(System.in);
        System.out.println(" Welcome to Hero of the Dungeon...");
        System.out.println("Please create your hero.");
        System.out.println("Please enter your hero name.");
        System.out.println("Hero's  HP at the beginning  is: ");
        String heroName= scanner.nextLine();

        ArrayList<Level> levels = generateLevels(16);
        boolean game =false;
        System.out.println("TYPE 1 TO START JOURNEY");
        int start= scanner.nextInt();
        if (start==1){game = true;}
        else {System.out.println("please enter a valid comment");}
        while (game=true)
        {
            System.out.println("SELECT YOUR WEAPON");

        }

    }

    public static ArrayList<Level> generateLevels(int levelNumber){
        ArrayList<Level> levels = new ArrayList<Level>();
        for(int i = 1;i<=levelNumber;i++) {
            ArrayList<Room> rooms = new ArrayList<>();
            Random rand = new Random();
            int numo = rand.nextInt(4);
            int floorNumber = rand.nextInt((3 - 1) + 1) + 1;
            int roomNumber = rand.nextInt((5 - 2) + 1) + 2;

            for (int j = 0; j < floorNumber; j++) {
                for (int k = j * roomNumber; k < roomNumber + (j * roomNumber); k++) {
                    Room room = new Room(k, new ArrayList<Door>(), new ArrayList<Stair>(),numo,Monster.newRandomMonster());
                    rooms.add(room);
                }
            }
            Level level = new Level(i, rooms);
            levels.add(level);
        }
        return levels;
    }
}
