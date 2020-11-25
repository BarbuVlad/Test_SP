package ro.uvt;

//ItemStatistics -
public class DisplayOrderCmd implements Order, Visitor<Integer>{


    int supaPuiCounter=0,fripturaPorcCounter=0,snitelPuiCounter=0,cartofiCounter=0,salataCounter=0,apaMineralaCounter=0;
    private Order order;
    public DisplayOrderCmd(Order order) {
        this.order=order;

    }

    @Override
    public Integer visitSupaPui(SupaPui supa) {
        this.supaPuiCounter++;
        return this.supaPuiCounter;
    }

    @Override
    public Integer visitFripturaPorc(FripturaPorc fripturaPorc) {
        this.fripturaPorcCounter++;
        return this.fripturaPorcCounter;
    }

    @Override
    public Integer visitSnitelDePui(SnitelDePui snitelDePui) {
        this.snitelPuiCounter++;
        return this.snitelPuiCounter;
    }

    @Override
    public Integer visitCartofi(Cartofi cartofi) {
        this.cartofiCounter++;
        return this.cartofiCounter;
    }

    @Override
    public Integer visitSalata(Salata salata) {
        this.salataCounter++;
        return this.salataCounter;
    }

    @Override
    public Integer visitApaMinerala(ApaMinerala apaMinerala) {
        this.apaMineralaCounter++;
        return this.apaMineralaCounter;
    }

    @Override
    public void execute(){
        //Afisaza tot ce contine order
        System.out.println(this.supaPuiCounter + " X Supe Pui x " + "pret" + "RON"); //order.pret(item)
        System.out.println(this.fripturaPorcCounter + " X Friptura de porc x " + "pret" + "RON");
        System.out.println(this.snitelPuiCounter + " X Snitel vienez x " + "pret" + "RON");
        System.out.println(this.cartofiCounter + " X Catofi Wedges x " + "pret" + "RON");
        System.out.println(this.salataCounter + " X Salata de rosii x " + "pret" + "RON");
        System.out.println(this.apaMineralaCounter + " X Apa minerala Counter x " + "pret" + "RON");

        //TOTAL
    }

}
