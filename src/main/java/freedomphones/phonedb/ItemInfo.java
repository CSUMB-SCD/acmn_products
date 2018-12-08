package freedomphones.phonedb;


public class ItemInfo{
    private String name;
    private Integer in_stock;
    private Double price;

    public ItemInfo(String name, Integer in_stock, Double price){
        this.name = name;
        this.in_stock = in_stock;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getIn_stock(){
        return this.in_stock;
    }
    public void setIn_stock(Integer in_stock){
        this.in_stock = in_stock;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

}