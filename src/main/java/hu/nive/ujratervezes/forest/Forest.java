package hu.nive.ujratervezes.forest;

import java.util.ArrayList;
import java.util.Iterator;
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
        trees.removeIf(lumberjack::canCut);
    }

    public void cutTrees2(Lumberjack lumberjack) {
        List<Tree> treesToCut = trees.stream().filter(lumberjack::canCut).collect(Collectors.toList());
        trees.removeAll(treesToCut);
    }

    public void cutTrees3(Lumberjack lumberjack) {
        Iterator iterator = trees.iterator();
        while (iterator.hasNext()) {
            if(lumberjack.canCut((Tree)iterator.next())) {
                iterator.remove();
            }
        }
    }

    public boolean isEmpty() {
        return trees.isEmpty();
    }

    public List<String> getStatus() {
        return trees.stream().map(tree -> String.format("There is a %d tall %s in the forest.", tree.getHeight(), tree.getClass().getSimpleName())).collect(Collectors.toList());
    }
}
