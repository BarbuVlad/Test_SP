package ro.uvt;

import java.util.ArrayList;
import java.util.List;

public class CreateOrderCmd implements  Order, Visitee{
    //Creaza o comanda, prin adaugare unui numar de elemente

    private List<Item> items;
    public CreateOrderCmd(List<Item> items) {
       this.items=items;
    }

    public CreateOrderCmd() {
        this.items = new ArrayList<Item>();
    }

    @Override
    public void add(Item item){
        if(item != null)
            this.items.add(item);
    }

    @Override
    public void execute(){
        System.out.println("Execute!");
    }

    @Override
    public void accept(Visitor v){
    }

    public void count(){
        DisplayOrderCmd commands= new DisplayOrderCmd(this);
        for (Item item:this.items) {
            break;
        }
        commands.execute();
    }
}
