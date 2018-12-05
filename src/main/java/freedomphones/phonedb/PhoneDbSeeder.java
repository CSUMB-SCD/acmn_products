package freedomphones.phonedb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import freedomphones.phonedb.phones.Phone;
import freedomphones.phonedb.phones.Picture;

@Component
public class PhoneDbSeeder implements CommandLineRunner{

    @Autowired
    IPhoneRepository phonerepo;


    @Override
    public void run(String... args) throws Exception {
        Phone iPhone = new Phone("Apple iPhone XS Max", 5, "A phone with a lot of features", new Picture("https://ss72.vzw.com/is/image/VerizonWireless/apple-iphonexs-max-spacegrey?$png8alpha256$&hei=600", "https://ss72.vzw.com/is/image/VerizonWireless/apple-iphonexs-max-spacegrey?$png8alpha256$&hei=1500"), 999.99);
        Phone note9 = new Phone("Samsung Galaxy Note 9", 8, "A samsung note phone", new Picture("https://ss7.vzw.com/is/image/VerizonWireless/samsung-galaxy-note9-blue?$png8alpha256$&hei=600", "https://ss7.vzw.com/is/image/VerizonWireless/samsung-galaxy-note9-blue?$png8alpha256$&hei=1500"), 899.99);
        Phone galaxyS9 = new Phone("Samsung Galaxy S 9", 4, "A samsung galaxy S phone", new Picture("https://ss7.vzw.com/is/image/VerizonWireless/SAMSUNG_Galaxy_S9_Blue?$png8alpha256$&hei=600", "https://ss7.vzw.com/is/image/VerizonWireless/SAMSUNG_Galaxy_S9_Blue?$png8alpha256$&hei=1500"), 799.99);
        Phone iPhone_xr = new Phone("Apple iPhone XR", 2, "An iPhone but with colors", new Picture("https://ss71.vzw.com/is/image/VerizonWireless/iPhoneXr_Black_PureAngles?$png8alpha256$&hei=600", "https://ss71.vzw.com/is/image/VerizonWireless/iPhoneXr_Black_PureAngles?$png8alpha256$&hei=1500"), 749.99);
        Phone pixel_3_xl = new Phone("Google Pixel 3 XL", 8, "A Google pixel phone that has a screen", new Picture("https://ss72.vzw.com/is/image/VerizonWireless/google-pixel-3xl-sand?$png8alpha256$&hei=600", "https://ss72.vzw.com/is/image/VerizonWireless/google-pixel-3xl-sand?$png8alpha256$&hei=1500"), 799.99);
        Phone lg_v40 = new Phone("LG V40 ThinQ", 7, "An LG phone with a good camera", new Picture("https://ss7.vzw.com/is/image/VerizonWireless/LG_V40_ThinQ_Blue?$png8alpha256$&hei=600", "https://ss7.vzw.com/is/image/VerizonWireless/LG_V40_ThinQ_Blue?$png8alpha256$&hei=1500"), 979.99);
        Phone lg_g7 = new Phone("LG G7 ThinQ", 6, "An LG phone that can call people", new Picture("https://ss71.vzw.com/is/image/VerizonWireless/LG_G7_Neo_Black?$png8alpha256$&hei=600", "https://ss71.vzw.com/is/image/VerizonWireless/LG_G7_Neo_Black?$png8alpha256$&hei=1500"), 750.00);
        Phone pixel_3 = new Phone("Google Pixel 3", 12, "A Google Pixel but smaller", new Picture("https://ss7.vzw.com/is/image/VerizonWireless/google-pixel-3-sand?$png8alpha256$&hei=600", "https://ss7.vzw.com/is/image/VerizonWireless/google-pixel-3-sand?$png8alpha256$&hei=1500"), 799.99);        
        phonerepo.deleteAll();
        List<Phone> phones = Arrays.asList(iPhone, note9, galaxyS9, iPhone_xr, pixel_3_xl, lg_v40, lg_g7, pixel_3);
        phonerepo.saveAll(phones);
    }

}