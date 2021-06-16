public class Stair {
    private Level targetLevel;

    public Stair(Level targetLevel) {
        this.targetLevel = targetLevel;
    }

    public Level getTargetLevel() {
        return targetLevel;
    }

    public void setTargetLevel(Level targetLevel) {
        this.targetLevel = targetLevel;
    }
}
