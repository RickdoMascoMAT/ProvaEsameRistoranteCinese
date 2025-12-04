package Component;

import java.util.Objects;

public class Pietanza {
    private String name = null;
    private int quantity = 0;
    private double unitCost = 0.0;

    public Pietanza(String name, int quantity, double unitCost) {
        this.name = name;
        this.quantity = quantity;
        this.unitCost = unitCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }


    public double getCost() {
        return (unitCost * quantity);
    }

    @Override
    public String toString() {
        return "Pietanza{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitCost=" + unitCost +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pietanza pietanza = (Pietanza) o;
        return quantity == pietanza.quantity && Double.compare(unitCost, pietanza.unitCost) == 0 && Objects.equals(name, pietanza.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity, unitCost);
    }
}
