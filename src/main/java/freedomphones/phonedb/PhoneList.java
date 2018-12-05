package freedomphones.phonedb;

import java.util.List;

import freedomphones.phonedb.phones.Phone;

public class PhoneList {
    List<Phone> phones;

    public List<Phone> getPhones(){
        return phones;
    }
    public void setPhones(List<Phone> phones){  
        this.phones = phones;
    }
}