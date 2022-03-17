package hu.nive.ujratervezes.forest;

public class FoxtailPine extends Tree{

    public FoxtailPine(int height) {
        super(height);
    }

    public FoxtailPine() {
    }

    @Override
    public void irrigate() {
        height ++;
    }
}
