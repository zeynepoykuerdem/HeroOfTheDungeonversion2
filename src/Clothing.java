public class  Clothing extends Item {
    private int protectionValue;
    public int getProtectionValue() {
        return protectionValue;
    }

    public void setProtectionValue(int protectionValue) {
        this.protectionValue = protectionValue;
    }
    public Clothing(String name, int weight, int value, int protectionValue) {
        super(name, weight, value);
        this.protectionValue = protectionValue;
    }

    public Clothing() {
        super();
        this.protectionValue = 0;
    }
    public void displayClothing(Clothing clothing){

    }

}
