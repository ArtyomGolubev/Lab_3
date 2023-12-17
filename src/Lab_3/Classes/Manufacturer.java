package Lab_3.Classes;

import Lab_3.AbstractClasses.AbstractCharacter;
import Lab_3.AbstractClasses.AbstractItem;
import Lab_3.AbstractClasses.AbstractPlace;
import Lab_3.Enums.Status;
import Lab_3.Interfaces.CanMoveByCar;

public class Manufacturer extends AbstractCharacter implements CanMoveByCar {
    private int money = 1000;

    public Manufacturer() {
        super("Крабс");
    }

    public void buy(AbstractItem item) {
        if (this.money - item.getItemPrice() >= 0) {
            System.out.println(super.getName() + " купил предмет " + item.getItemName());
            this.money -= item.getItemPrice();
        } else {
            System.out.println("У " + this.getName() + " недостаточно денег для покупки " + item.getItemName());
        }
    }

    public void eat() {
        System.out.println(super.getName() + " ест");
        this.setStatus(Status.Saturated);
    }

    public void talkWith(AbstractCharacter person1, AbstractCharacter person2){
        System.out.println(getName() + " отвел в сторонку " + person1.getName() + " и " + person2.getName() + " и поговорил с ними");
        person1.setStatus(Status.Interested);
        person2.setStatus(Status.Interested);
    }

    public void arrangeMeeting(Meeting m, AbstractPlace place) {
        m.setLocation(place);
        System.out.println(getName() + " организовал " + m.getTitle() + " в " + place.getPlaceName());
    }

    public void moveByCar(AbstractPlace place) {
        super.setWhereabouts(place);
        System.out.println(super.getName() + " приехал в " + place.getPlaceName() + " на машине");
    }
}