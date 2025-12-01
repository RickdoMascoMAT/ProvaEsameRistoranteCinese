package Component;

import java.util.ArrayList;

public class OrdineTavolo extends Ordine {
    private int tavolo;

    public OrdineTavolo(int priority, ArrayList<Pietanza> pietanze, int tavolo) {
        super(priority, pietanze);
        this.tavolo = tavolo;
    }

    public int getTavolo() {
        return tavolo;
    }
}
