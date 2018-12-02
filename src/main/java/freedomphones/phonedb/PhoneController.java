package freedomphones.phonedb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.phonedb.phones.Phone;

@CrossOrigin
@RestController
public class PhoneController{
    @Autowired
    IPhoneRepository phoneRepository;

    @GetMapping("/allPhones")
    public List<Phone> getAll(){
        List<Phone> phones = phoneRepository.findAll();
        return phones; 
    }
}