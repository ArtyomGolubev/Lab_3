package Lab_3.Classes;

import Lab_3.AbstractClasses.AbstractCharacter;
import Lab_3.AbstractClasses.AbstractItem;
import Lab_3.AbstractClasses.AbstractPlace;
import Lab_3.Enums.Status;

public class Businessman1 extends AbstractCharacter {
    private int money = 100;
    public Businessman1() {
        super("Жулио");
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
}