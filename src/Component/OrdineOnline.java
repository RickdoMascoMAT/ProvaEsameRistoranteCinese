package Component;

import java.util.ArrayList;

public class OrdineOnline extends Ordine {
    private String indirizzo = null;
    private int surplus = 0;
    private boolean cash = false;

    public OrdineOnline(int priority, ArrayList<Pietanza> pietanze, String indirizzo, int surplus, boolean cash) {
        super(priority, pietanze);
        this.indirizzo = indirizzo;
        this.surplus = surplus;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return super.toString() +
                "OrdineOnline{" +
                "tavolo=" + indirizzo +
                '}';
    }

    public String getIndirizzo() {
        return indirizzo;
    }
}
