package Component;

import java.util.ArrayList;

public class OrdineOnline extends Ordine{
    private int tavolo;
    private int surplus;
    private boolean cash;

    public OrdineOnline(int priority, ArrayList<Pietanza> pietanze, int tavolo) {
        super(priority, pietanze);
        this.tavolo = tavolo;
    }

    @Override
    public String toString() {
        return "OrdineOnline{" +
                "tavolo=" + tavolo +
                '}';
    }

    public int getTavolo() {
        return tavolo;
    }
}
