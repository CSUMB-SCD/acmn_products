package freedomphones.phonedb;

import java.util.HashMap;


public class Stock {
    HashMap<String, ItemInfo> stock;


    public Stock(HashMap<String, ItemInfo> stock){
        this.stock = stock;
    }
    public Stock(){
        this.stock = new HashMap<String, ItemInfo>();
    }

    public HashMap<String, ItemInfo> getStock(){
        return this.stock;
    }
    public void setStock(HashMap<String, ItemInfo> stock){
        this.stock = stock;
    }
}