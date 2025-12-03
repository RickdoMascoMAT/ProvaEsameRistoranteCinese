package Component;

import java.util.ArrayList;

public class OrdineTavolo extends Ordine {
    private int tavolo = -1;

    public OrdineTavolo(int priority, ArrayList<Pietanza> pietanze, int tavolo) {
        super(priority, pietanze);
        this.tavolo = tavolo;
    }

    public int getTavolo() {
        return tavolo;
    }

    public void setTavolo(int tavolo) {
        this.tavolo = tavolo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "OrdineTavolo{" +
                "tavolo=" + tavolo +
                '}';
    }
}
