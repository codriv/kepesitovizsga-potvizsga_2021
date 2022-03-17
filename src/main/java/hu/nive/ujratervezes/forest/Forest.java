package hu.nive.ujratervezes.forest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Forest {

    private List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void rain() {
        trees.forEach(Tree::irrigate);
    }

    public void cutTrees(Lumberjack lumberjack) {
        List<Tree> treesToCut = trees.stream().filter(lumberjack::canCut).collect(Collectors.toList());
        trees.removeAll(treesToCut);
    }

    public boolean isEmpty() {
        return trees.isEmpty();
    }

    public List<String> getStatus() {
        return trees.stream().map(tree -> "There is a " + tree.getHeight() + " tall " + tree.getClass().getSimpleName() + " in the forest.").collect(Collectors.toList());
    }
}
