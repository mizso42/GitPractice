package main.model.humanoids;

public class Cyborg extends Humanoid {
    @Override
    public void setSad(boolean sad) {
        this.isSad = !sad;
    }
}
