package freedomphones.phonedb.phones;

public class Quantity{
    private Integer qty;

    public Quantity(Integer qty){
        this.qty = qty;
    }
    public void setQuantity(Integer qty){
        this.qty = qty;
    }
    public Integer getQuantity(){
        return this.qty;
    }
}