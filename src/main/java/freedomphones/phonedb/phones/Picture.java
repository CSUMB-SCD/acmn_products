package freedomphones.phonedb.phones;

public class Picture{
    private String lowres;
    private String highres;

    public Picture(String lowres, String highres){
        this.lowres = lowres;
        this.highres = highres;
    }

    public void setLowRes(String link){
        this.lowres = link;
    }
    public String getLowRes(){
        return this.lowres;
    }
    public void setHighRes(String link){
        this.highres = link;
    }
    public String getHighRes(){
        return this.highres;
    }
}