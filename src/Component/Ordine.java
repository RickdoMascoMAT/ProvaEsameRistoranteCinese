package Component;

import java.util.ArrayList;
import java.util.Objects;

public class Ordine implements Cloneable, Comparable<Ordine>{
    private static int unique_id = -1;

    private int id;

    private ArrayList<Pietanza> pietanze;
    private int priority;

    public Ordine() {
        this.id = ++unique_id;
    }

    public Ordine(int priority, ArrayList<Pietanza> pietanze) {
        this.id = ++unique_id;
        this.priority = priority;
        this.pietanze = pietanze;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Pietanza> getPietanze() {
        return pietanze;
    }

    public void setPietanze(ArrayList<Pietanza> pietanze) {
        this.pietanze = pietanze;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordine ordine = (Ordine) o;
        return id == ordine.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Ordine o) {
        int cmp = Integer.compare(o.priority, this.priority);
        if (cmp != 0) return cmp;
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id= " + id +
                "unique_id=" + unique_id +
                ", pietanze=" + pietanze +
                ", priority=" + priority +
                '}';
    }

    @Override
    public Ordine clone() {
        try {
            Ordine clone = (Ordine) super.clone();
            // assegna un nuovo id univoco al clone
            clone.id = ++unique_id;
            // copia superficiale della lista per evitare condivisione della lista mutabile
            clone.pietanze = this.pietanze == null ? null : new ArrayList<>(this.pietanze);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
