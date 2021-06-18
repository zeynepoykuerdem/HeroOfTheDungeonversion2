public class Item {
    private String name;
    private int weight;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value =value;
    }

    public Item(){
        this.name="null";
        this.weight=0;
        this.value =0;
    }
}




