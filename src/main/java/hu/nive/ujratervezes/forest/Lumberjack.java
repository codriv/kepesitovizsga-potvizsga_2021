package hu.nive.ujratervezes.forest;

public class Lumberjack {

    private final int LIMIT = 4;
    public Lumberjack() {
    }

    public boolean canCut(Tree tree) {
        return tree.getHeight() > LIMIT;
    }

}
