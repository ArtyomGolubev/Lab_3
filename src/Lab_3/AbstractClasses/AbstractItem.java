package Lab_3.AbstractClasses;

public abstract class AbstractItem {
    private String itemname;
    private int itemprice;

    public AbstractItem(String itemname, int itemprice) {
        this.itemname = itemname;
        this.itemprice = itemprice;
    }

    public String getItemName() {
        return this.itemname;
    }

    public int getItemPrice() {
        return this.itemprice;
    }

    @Override
    public String toString() {
        return "Предмет " + itemname;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getItemName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}