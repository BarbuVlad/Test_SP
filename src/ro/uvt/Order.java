package ro.uvt;

public interface Order {
    //int pretTotal
    
    void execute();

    default void add (Item item){};
}
