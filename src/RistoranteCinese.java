import Component.Ordine;
import Component.OrdineTavolo;
import Component.Pietanza;

import java.util.ArrayList;

public class RistoranteCinese {
    private ArrayList<Ordine> ordiniDaEvadere;
    private ArrayList<Ordine> ordiniEvasi;
    private int incasso;

    public void addOnlineOrder() {
        throw new UnsupportedOperationException();
    }

    public void addAtTableOrder(int priority, ArrayList<Pietanza> pietanze, int tavolo){
        OrdineTavolo ot = new OrdineTavolo(priority, pietanze, tavolo);
        ordiniDaEvadere.add(ot);
    }

    public Ordine findOrderFunctional(int id){
        return ordiniDaEvadere.stream()
                .filter(o->o.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
