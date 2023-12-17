package Lab_3.Classes;

import Lab_3.AbstractClasses.AbstractCharacter;
import Lab_3.AbstractClasses.AbstractItem;
import Lab_3.Enums.Status;

public class Businessman extends AbstractCharacter {
    private int money = 100;

    public Businessman(String name) {
        super(name);
    }

    public void buy(AbstractItem item) {
        if (this.money - item.getItemPrice() >= 0) {
            System.out.println(super.getName() + " купил предмет " + item.getItemName());
            this.money -= item.getItemPrice();
        } else {
            System.out.println("У " + this.getName() + " недостаточно денег для покупки " + item.getItemName());
        }
    }

    public void agreeFor(Meeting m, AbstractCharacter p){
        if (this.getStatus() == Status.Interested) {
            System.out.println(getName() + " согласился на " + m.getTitle() + " с " + p.getName() + " так как он заинтересован");
            m.addParticipant(this);
        }
        else System.out.println(getName() + " не согласился на " + m.getTitle() + " с " + p.getName());
    }

    public void eat() {
        System.out.println(super.getName() + " ест");
        this.setStatus(Status.Saturated);
    }
}
