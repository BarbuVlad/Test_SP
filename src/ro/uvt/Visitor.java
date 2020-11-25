package ro.uvt;

public interface Visitor<type> {
    type visitSupaPui(SupaPui supa);
    type visitFripturaPorc(FripturaPorc fripturaPorc);
    type visitSnitelDePui(SnitelDePui snitelDePui);
    type visitCartofi(Cartofi cartofi);
    type visitSalata(Salata salata);
    type visitApaMinerala(ApaMinerala apaMinerala);

}
