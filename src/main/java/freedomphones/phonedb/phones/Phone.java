package freedomphones.phonedb.phones;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Phones")
public class Phone{
    @Id
    private String id;
    private String name;
    private Integer qty;
    private String description;
    private Picture picture;
    private Double price;

    public Phone(String name, Integer qty, String description, Picture picture, Double price){
        this.name = name;
        this.qty = qty;
        this.description = description;
        this.picture = picture;
        this.price = price;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setQty(Integer qty){
        this.qty = qty;
    }
    public Integer getQty(){
        return this.qty;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setPicture(Picture picture){
        this.picture = picture;
    }
    public Picture getPicture(){
        return this.picture;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
}