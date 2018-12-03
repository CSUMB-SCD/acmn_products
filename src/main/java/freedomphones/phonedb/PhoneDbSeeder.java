package freedomphones.phonedb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import freedomphones.phonedb.phones.Description;
import freedomphones.phonedb.phones.Name;
import freedomphones.phonedb.phones.Phone;
import freedomphones.phonedb.phones.Quantity;
import freedomphones.phonedb.phones.Picture;
import freedomphones.phonedb.phones.Price;

@Component
public class PhoneDbSeeder implements CommandLineRunner{

    @Autowired
    IPhoneRepository phonerepo;


    @Override
    public void run(String... args) throws Exception {
        Phone iPhone = new Phone(new Name("iPhone X"), new Quantity(5), new Description("A phone with a lot of features"), new Picture("https://ss7.vzw.com/is/image/VerizonWireless/iPhoneX-Svr?$device-lg$", "https://store.storeimages.cdn-apple.com/4981/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ph/iphone/xs/iphone-xs-select-2018-group?wid=552&hei=892&fmt=jpeg&qlt=80&op_usm=0.5,0.5&.v=1536616752423"), new Price(999.99));
        Phone note9 = new Phone(new Name("Samsung Galaxy Note 9"), new Quantity(8), new Description("A samsung note phone"), new Picture("https://ss7.vzw.com/is/image/VerizonWireless/samsung-galaxy-note9-blue?$png8alpha256$&hei=410", "http://www.pngnames.com/files/3/Samsung-Galaxy-Note-9-PNG.png"), new Price(899.99));
        Phone galaxyS9 = new Phone(new Name("Samsung Galaxy S 9"), new Quantity(4), new Description("A samsung galaxy S phone"), new Picture("https://ss7.vzw.com/is/image/VerizonWireless/SAMSUNG_Galaxy_S9_Blue?$png8alpha256$&hei=410", "https://www.chinahandys.net/wp-content/uploads/2018/04/samsung-galaxy-s9-clone-testbericht/Samsung-Galaxy-S9-Test-900x900.jpg"), new Price(799.99));
        phonerepo.deleteAll();
        List<Phone> phones = Arrays.asList(iPhone, note9, galaxyS9);
        phonerepo.saveAll(phones);
    }

}