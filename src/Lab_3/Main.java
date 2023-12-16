package Lab_3;

import Lab_3.Classes.*;

public class Main {
    public static void main(String[] args) {

        //Characters
        Manufacturer Krabs = new Manufacturer();
        Businessman1 Julio = new Businessman1();
        Businessman2 Miga = new Businessman2();

        //Places
        GPSoffice GPSoffice = new GPSoffice("контора Общества гигантских растений");
        Hotel hotel = new Hotel("гостиница");
        Restaurant restaurant = new Restaurant("ресторан");

        //Items
        Dinner dinner = new Dinner();
        Stocks stocks = new Stocks();

        //Action
        Miga.setWhereabouts(GPSoffice);
        Julio.setWhereabouts(GPSoffice);
        Krabs.move(GPSoffice);
        Krabs.buy(stocks);
        Krabs.talkWith(Miga, Julio);
        Krabs.moveByCar(hotel);
        Miga.move(hotel);
        Julio.move(hotel);
        Krabs.move(restaurant);
        Julio.move(restaurant);
        Miga.move(restaurant);
        Krabs.buy(dinner);
        Krabs.eat();
        Julio.buy(dinner);
        Julio.eat();
        Miga.buy(dinner);
        Miga.eat();
    }
}