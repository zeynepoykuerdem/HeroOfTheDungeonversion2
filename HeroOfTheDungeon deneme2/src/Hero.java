import java.util.ArrayList;
import java.util.Random;

public abstract class Hero extends Character implements Battle{
    private Weapon weapon;
    private Clothing clothing;
    private int portableWeight;
    private int rescuedPeople;

    {
        rescuedPeople = 0;
    }

    private ArrayList<Item> Inventory;


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setArmor(Clothing clothing) {
        this.clothing = clothing;
    }

    public int getPortableWeight() {
        return portableWeight;
    }

    public void setPortableWeight(int portableWeight) {
        this.portableWeight = portableWeight;
    }

    public ArrayList<Item> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        Inventory = inventory;
    }


    public Hero(String name, int HP, int hitDamage, Weapon weapon, Clothing clothing, int portableWeight, ArrayList<Item> inventory) {
        super(name, HP, hitDamage);
        this.weapon = weapon;
        this.clothing = clothing;
        this.portableWeight = portableWeight;
        Inventory = inventory;
    }

    public Hero(Weapon weapon, Clothing clothing, int portableWeight, ArrayList<Item> inventory) {
        super();
        this.weapon = weapon;
        this.clothing = clothing;
        this.portableWeight = portableWeight;
        Inventory = inventory;
    }



    @Override
    public void heroAttack(Monster monster) {
        Random random = new Random();
        int randomRange =random.nextInt(10);
        if (randomRange<=getWeapon().getRangeValue()) {
            if (monster.getClothing().getProtectionValue()+monster.getWeapon().getBlockAction()<getWeapon().getDamage()+getHitDamage()) {
                System.out.println("Hero is attacking to Monster...");
                System.out.println("The Damage Given by Hero to Monster: " + getHitDamage() + getWeapon().getDamage() * getWeapon().getRangeValue());
                monster.setHP(monster.getHP() + monster.getClothing().getProtectionValue() - getHitDamage() + getWeapon().getDamage() * getWeapon().getRangeValue());
                System.out.println();
            }
            else{
                System.out.println("Monster blocked the attack...");
            }
        }
        else if(randomRange>getWeapon().getRangeValue()){
            System.out.println("The hero missed the attack...");
        }
    }

}
