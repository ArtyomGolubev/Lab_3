package Lab_3.AbstractClasses;

import java.util.ArrayList;

public abstract class AbstractPlace {
    private String placename;
    public ArrayList<AbstractCharacter> characters = new ArrayList<>();

    public AbstractPlace(String placename) {
        this.placename = placename;
    }

    public void goAway(AbstractCharacter p){
        this.characters.remove(p);
    }

    public String getPlaceName() {
        return this.placename;
    }

    @Override
    public String toString() {
        return "Место " + placename;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getPlaceName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
