package ro.uvt;

public class Main {

    public static void main(String[] args) {


        // CreateOrderCmd va crea comanda cu continutul de mai sus
        Order order = new CreateOrderCmd();
        //adauga niste elemente:
        SupaPui sp1 = new SupaPui();
        SupaPui sp2 = new SupaPui();
        order.add(sp1);
        order.add(sp1);




        order.execute();

        // Va afisa comanda precum mai sus
        new DisplayOrderCmd(order).execute();


    }
}
