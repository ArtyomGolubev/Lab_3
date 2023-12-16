package Lab_3.AbstractClasses;

import Lab_3.Enums.Status;
import Lab_3.Interfaces.CanMove;

public abstract class AbstractCharacter implements CanMove {
    private String name=null;
    private Status status=null;
    private AbstractPlace whereabouts=null;

    public AbstractCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(Status status) {
        this.status = status;
        switch (status) {
            case Interested:
                System.out.println(this.getName() + " заинтересован");
                break;
            case Saturated:
                System.out.println(this.getName() + " сытый");
                break;
        }
    }

    public Status getStatus() {
        return this.status;
    }

    public void setWhereabouts(AbstractPlace place) {
        if (this.whereabouts != null){
            this.whereabouts.goAway(this);
        }
        this.whereabouts = place;
        place.characters.add(this);
    }

    public void move(AbstractPlace place) {
        this.setWhereabouts(place);
        System.out.println(this.name + " оказался в " + place.getPlaceName());
    }

    @Override
    public String toString() {
        return "Персонаж " + name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
