package freedomphones.phonedb.phones;

public class Picture{
    private String link;

    public Picture(String link){
        this.link = link;
    }

    public void setName(String link){
        this.link = link;
    }
    public String getName(){
        return this.link;
    }
}