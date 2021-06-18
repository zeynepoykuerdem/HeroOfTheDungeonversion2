import java.util.Random;
import java.util.Scanner;

public abstract class Monster extends Character implements Battle{
    private Weapon weapon;
    private Clothing clothing;

    String name; int hp; int damage;int armor;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }
/*
    public Monster(String name, int HP, int hitDamage, Weapon weapon, Clothing clothing) {
        super(name, HP, hitDamage);
        this.weapon = weapon;
        this.clothing = clothing;
    }

    public Monster(Weapon weapon, Clothing clothing) {
        super();
        this.weapon = weapon;
        this.clothing = clothing;
    }
 */

    public Monster(String name, int hp, int damage, int armor) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    public static Monster spider() {
        return new Monster("SPİDER", 100, 15, 16) {
            @Override
            public void heroAttack(Monster monster) {

            }
        };
    }

    public static Monster snake() {
        return new Monster("SNAKE", 1000, 25, 28) {
            @Override
            public void heroAttack(Monster monster) {

            }
        };
    }

    public static Monster clown() {
        return new Monster("CLOWN", 10000, 100, 100) {
            @Override
            public void heroAttack(Monster monster) {

            }
        };
    }

    public static Monster abyss() {
        return new Monster("abyss", 1000000, 1111111, 0) {
            @Override
            public void heroAttack(Monster monster) {

            }
        };
    }
    public static Monster newRandomMonster() {
        int random = Main.RAND.nextInt(4) + 1;
        Monster monster = null;
        switch (random) {
            case 1:
                monster = spider();
                break;
            case 2:
                monster = snake();
                break;
            case 3:
                monster = clown();
                break;
            case 4:
                monster = abyss();
                break;
        }
        return monster;
    }
    @Override
    public void monsterAttack(Hero hero) {
        Random random = new Random();
        int randomRange =random.nextInt(10);
        if (randomRange<=getWeapon().getRangeValue()) {
            if (hero.getClothing().getProtectionValue() + hero.getWeapon().getBlockAction()<getWeapon().getDamage()+getHitDamage()) {
                System.out.println("Monster is attacking back to hero...");
                System.out.println("The Damage Given by Monster to Hero: " + getHitDamage() + getWeapon().getDamage() * getWeapon().getRangeValue());
                hero.setHP(hero.getHP() + hero.getClothing().getProtectionValue() - getHitDamage() + getWeapon().getDamage() * getWeapon().getRangeValue());
                System.out.println();
            }
            else{
                System.out.println("Hero blocked the attack...");
            }
        }
        else if(randomRange>getWeapon().getRangeValue()){
            System.out.println("The monster missed the attack...");
        }
    }

    public void monsterDropItem(Monster monster,Hero hero){
        Scanner input = new Scanner(System.in);
        int choice=0;
        System.out.println("The monster is dead, these dropped items are its items: ");
        System.out.println("Weapon= "+monster.getWeapon());
        System.out.println("Armor= "+monster.getClothing());
        System.out.println("If you want to pick weapon press 1.");
        System.out.println("If you want to pick armor press 2.");
        System.out.println("If you want to pick both of them press 3");
        System.out.println("If you don't want to pick none of them press 4");
        choice=input.nextInt();
        switch (choice){
            case 1:
                hero.getInventory().add(monster.getWeapon());
                break;

            case 2:
                hero.getInventory().add(monster.getClothing());
                break;

            case 3:
                hero.getInventory().add(monster.getWeapon());
                hero.getInventory().add(monster.getClothing());
                break;

            case 4:
                System.out.println("You didn't pick any items.");
                break;
        }


    }


}

