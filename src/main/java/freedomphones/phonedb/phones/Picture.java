package freedomphones.phonedb.phones;

public class Picture{
    private String link;

    public Picture(String link){
        this.link = link;
    }

    public void setPicture(String link){
        this.link = link;
    }
    public String getPicture(){
        return this.link;
    }
}