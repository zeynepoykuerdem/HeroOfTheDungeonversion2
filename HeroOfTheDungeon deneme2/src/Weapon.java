public class Weapon extends Item {
    private int damage;
    private int rangeValue;
    private int blockAction;



    public  int getBlockAction() {
        return blockAction;
    }

    public void setBlockAction(int blockAction) {
        this.blockAction = blockAction;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRangeValue() {
        return rangeValue;
    }

    public void setRangeValue(int rangeValue) {
        this.rangeValue = rangeValue;
    }

    public Weapon(String name, int weight, int value, int damage, int rangeValue, int blockAction) {
        super(name, weight, value);
        this.damage = damage;
        this.rangeValue = rangeValue;
        this.blockAction = blockAction;
    }

    public  Weapon() {
        super();
        this.damage = 0;
        this.rangeValue = 0;
    }

    public void displayWeapon(Weapon weapon) {
        if (weapon instanceof Sword) {
            System.out.println("The Name of the Sword: " + super.getName());
            System.out.println("The Weight of the Sword: " + super.getWeight());
            System.out.println("The Worth of the Sword: " + super.getValue());
            System.out.println("The Damage Value of the Sword: " + getDamage());
            System.out.println("The Range of the Sword: " + getRangeValue());
            System.out.println();
        } else if (weapon instanceof Axe) {
            System.out.println("The Name of the Axe: " + super.getName());
            System.out.println("The Weight of the Axe: " + super.getWeight());
            System.out.println("The Worth of the Axe: " + super.getValue());
            System.out.println("The Damage Value of the Axe: " + getDamage());
            System.out.println("The Range of the Axe: " + getRangeValue());
            System.out.println();
        } else if (weapon instanceof Bow) {
            System.out.println("The Name of the Bow: " + super.getName());
            System.out.println("The Weight of the Bow: " + super.getWeight());
            System.out.println("The Worth of the Bow: " + super.getValue());
            System.out.println("The Damage Value of the Bow: " + getDamage());
            System.out.println("The Range of the Bow: " + getRangeValue());
            System.out.println();
        }
    }
}




