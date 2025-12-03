import Component.Ordine;
import Component.OrdineOnline;
import Component.OrdineTavolo;
import Component.Pietanza;

import java.util.ArrayList;
import java.util.Scanner;

public class RistoranteCinese {
    private ArrayList<Ordine> ordiniDaEvadere = new ArrayList<>();
    private ArrayList<Ordine> ordiniEvasi = new ArrayList<>();
    private double incasso = 0.0;

    public RistoranteCinese() {
        ordiniDaEvadere = new ArrayList<>();
        ordiniEvasi = new ArrayList<>();
        incasso = 0.0;
    }

    public void addOnlineOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci priority: ");
        int priority = sc.nextInt();
        ArrayList<Pietanza> pietanze = new ArrayList<>();
        boolean finito = false;
        while(!finito){
            System.out.println("Nome piatto: ");
            String nomePiatto = sc.nextLine();
            System.out.println("Inserisci quantità: ");
            int quantita = sc.nextInt();
            System.out.println("Prezzo unitario piatto: ");
            double prezzoUnitario = sc.nextDouble();
            Pietanza pietanza = new Pietanza(nomePiatto, quantita, prezzoUnitario);
            pietanze.add(pietanza);
            System.out.println("Fine ordinazione: ");
            finito = sc.nextBoolean();
        }

        System.out.println("inserisci surplus: ");
        int surplus = sc.nextInt();
        System.out.println("inserisci indirizzo: ");
        String indirizzo = sc.nextLine();
        System.out.println("Pagamento in contanti: ");
        boolean cash = sc.nextBoolean();

        OrdineOnline ordineOnline = new OrdineOnline(priority, pietanze, indirizzo, surplus, cash);

        ordiniDaEvadere.add(ordineOnline);
    }

    public void addAtTableOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci priority: ");
        int priority = sc.nextInt();
        ArrayList<Pietanza> pietanze = new ArrayList<>();
        boolean finito = false;
        while(!finito){
            System.out.println("Nome piatto: ");
            String nomePiatto = sc.nextLine();
            System.out.println("Inserisci quantità: ");
            int quantita = sc.nextInt();
            System.out.println("Prezzo unitario piatto: ");
            double prezzoUnitario = sc.nextDouble();
            Pietanza pietanza = new Pietanza(nomePiatto, quantita, prezzoUnitario);
            pietanze.add(pietanza);
            System.out.println("Fine ordinazione: ");
            finito = sc.nextBoolean();
        }

        System.out.println("inserisci tavolo: ");
        int tavolo = sc.nextInt();

        OrdineTavolo ordineTavolo = new OrdineTavolo(priority, pietanze, tavolo);

        ordiniDaEvadere.add(ordineTavolo);
    }

    private Ordine findOrderNotEvadedFunctional(int id) {
        return ordiniDaEvadere.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private Ordine findOrderEvadedFunctional(int id) {
        return ordiniEvasi.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }


    public Ordine findOrder(int id){
        return findOrderNotEvadedFunctional(id);
    }

    public Ordine findServedOrder(int id){
        return findOrderEvadedFunctional(id);
    }

    public ArrayList<Ordine> getAllWithin(int priority1, int priority2){
        ArrayList<Ordine> ordini = new ArrayList<>();
        for(Ordine o: ordiniEvasi){
            if(o.getPriority() >= priority1 && o.getPriority() <= priority2){
                ordini.add(o);
            }
        }

        for(Ordine o: ordiniDaEvadere){
            if(o.getPriority() >= priority1 && o.getPriority() <= priority2){
                ordini.add(o);
            }
        }

        return ordini;
    }
}
