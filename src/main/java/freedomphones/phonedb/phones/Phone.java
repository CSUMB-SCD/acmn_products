package freedomphones.phonedb.phones;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Phones")
public class Phone{
    @Id
    private String id;
    private Name name;
    private Quantity qty;
    private Description description;
    private Picture picture;

    public Phone(Name name, Quantity qty, Description description, Picture picture){
        this.name = name;
        this.qty = qty;
        this.description = description;
        this.picture = picture;
    }

    public void setName(Name name){
        this.name = name;
    }
    public Name getName(){
        return this.name;
    }
    public void setQty(Quantity qty){
        this.qty = qty;
    }
    public Quantity getQty(){
        return this.qty;
    }
    public void setDescription(Description description){
        this.description = description;
    }
    public Description getDescription(){
        return this.description;
    }
    public void setPicture(Picture picture){
        this.picture = picture;
    }
    public Picture getPicture(){
        return this.picture;
    }
}